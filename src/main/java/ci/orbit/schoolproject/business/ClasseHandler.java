package ci.orbit.schoolproject.business;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.AnneescolaireRepository;
import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.EleveRepository;
import ci.orbit.schoolproject.dao.InscriptionRepository;
import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Matiere;

@Service
@Transactional
public class ClasseHandler implements ClasseInterface {
	
	@Autowired
	private ClasseRepository classeRepository;
	
	@Autowired
	private EleveRepository eleveRepository;
	
	@Autowired
	private AnneescolaireRepository anneescolaireRepository;
	
	@Autowired
	private InscriptionRepository inscriptionRepository;

	

	@Override
	public List<Matiere> getEmploiDuTempsByClasse(Long idClasse) {
		// TODO Auto-generated method stub
		return null;
	}

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
		// TODO Auto-generated method stub
		return null;
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
	public List<Eleve> listEleveByClasse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
