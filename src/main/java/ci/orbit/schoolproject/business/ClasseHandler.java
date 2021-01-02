package ci.orbit.schoolproject.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.AnneeScolaireRepository;
import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.EleveRepository;
import ci.orbit.schoolproject.dao.EmploiDuTempsRepository;
import ci.orbit.schoolproject.dao.InscriptionRepository;
import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.EmploiDuTemps;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Semaine;
import ci.orbit.schoolproject.exception.NotFoundException;

@Service
@Transactional
public class ClasseHandler implements ClasseInterface {
	
	@Autowired
	private ClasseRepository classeRepository;
	
	@Autowired
	private EleveRepository eleveRepository;
	
	@Autowired
	private AnneeScolaireRepository anneescolaireRepository;
	
	@Autowired
	private InscriptionRepository inscriptionRepository;
	
	@Autowired
	private EmploiDuTempsRepository<Matiere> emploiDuTempsRepository;
	
	@Override
	public void setProfesseurCours(Long idClasse, Long idProfesseur, Long idMatiere) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEvaluationClasse(Long idClasse, Long idProfesseur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Classe createClasse(String designation, String niveau) {
		Classe cls = classeRepository.save(new Classe(designation, niveau));
		return cls;
	}

	@Override
	public Classe readClasse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classe updateClasse(Long id, String designation, String niveau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClasse(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Classe> listClasse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Eleve> listEleveByClasse(Classe classe, AnneeScolaire annee) throws NotFoundException{
		ArrayList<Eleve> eleves = new ArrayList<Eleve>();
		List<Inscription> inscription = inscriptionRepository.findByClasseAndAnneeScolaire(classe, annee);
		if(!inscription.isEmpty()) {		
			inscription.forEach(e->{eleves.add(e.getEleve());});
			return eleves;
		}
		else{
			throw new NotFoundException("Liste d'élèves non trouvée");
		}
	}

	@Override
	public List<Matiere> getMatiereByClasse(Classe classe) throws NotFoundException{
		ArrayList<Matiere> matieres = new ArrayList<Matiere>();
		List<EmploiDuTemps> list = emploiDuTempsRepository.findByClasse(classe);
		if(!list.isEmpty()) {		
			list.forEach(e->{matieres.add(e.getMatiere());});
			return matieres;
		}
		else{
			throw new NotFoundException("Liste d'élèves non trouvée");
		}
	}

	@Override
	public List<EmploiDuTemps> getClasseEmploiDuTemps(Classe classe) throws NotFoundException{
		ArrayList<EmploiDuTemps> emploidt = new ArrayList<EmploiDuTemps>();
		List<EmploiDuTemps> list = emploiDuTempsRepository.findByClasse(classe);
		if(!list.isEmpty()) {		
			list.forEach(e->{emploidt.add(e);});
			return emploidt;
		}
		else{
			throw new NotFoundException("Emploi du temps non trouvée");
		}
	}

}
