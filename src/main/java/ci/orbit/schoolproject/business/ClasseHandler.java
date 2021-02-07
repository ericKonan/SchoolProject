package ci.orbit.schoolproject.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.EmploiDuTempsRepository;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.EmploiDuTemps;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.entities.Salle;
import ci.orbit.schoolproject.exception.ClasseHasNoEleveException;
import ci.orbit.schoolproject.exception.ClasseHasNoEmploiDTException;
import ci.orbit.schoolproject.exception.ClasseNotFoundException;

public class ClasseHandler implements ClasseInterface {
	
	@Autowired
	ClasseRepository classeRepository;
	
	@Autowired
	EmploiDuTempsRepository emploiDuTempsRepository;

	@Override
	public Classe createClasse(@Valid Classe classe) {
		return classeRepository.save(classe);
	}

	@Override
	public Classe updateClasse(Classe classe, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classe getClasse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClasse(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Classe> getAllClasse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Eleve> getElevesByClasse(Classe classe) {
		ArrayList<Eleve> eleves = new ArrayList<Eleve>();
		List<Inscription> inscription = classe.getInscriptions();
		if(inscription.isEmpty()) 	
			throw new ClasseHasNoEleveException("Cette Classe n'a aucun eleve inscrit");
		inscription.forEach(e->{eleves.add(e.getEleve());});
		return eleves;
		
		
	}

	@Override
	public List<Matiere> getMatiereByClasse(Classe classe) {
		ArrayList<Matiere> matieres = new ArrayList<Matiere>();
		List<EmploiDuTemps> list = emploiDuTempsRepository.findByClasse(classe);
		if(list.isEmpty()) 	
			throw new ClasseHasNoEmploiDTException("Cette Classe n'a aucun emploi du temps");
		list.forEach(m->{matieres.add(m.getMatiere());});
		return matieres;
	}
	
	@Override
	public void setClasseAffectation(Long id, Salle salle) {
		Optional<Classe> opt = classeRepository.findById(id);
		if(!opt.isPresent())
			throw new ClasseNotFoundException("Classe introuvable");
		opt.get().setId(id);
		opt.get().setSalle(salle);
	}

	@Override
	public List<EmploiDuTemps> getClasseEmploiDuTemps(Classe classe) {
		List<EmploiDuTemps> list = emploiDuTempsRepository.findByClasse(classe);
		if(list.isEmpty()) 	
			throw new ClasseHasNoEmploiDTException("Cette Classe n'a aucun emploi du temps");
		return list;
	}

	@Override
	public void setProfesseurCours(Classe classe, Professeur professeur, Matiere matiere) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEvaluationClasse(Classe classe, Professeur professeur) {
		// TODO Auto-generated method stub

	}

}
