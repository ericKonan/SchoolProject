package ci.orbit.schoolproject.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.ProfesseurRepository;
import ci.orbit.schoolproject.entities.Cours;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.exception.NotFoundException;
@Service
@Transactional
public class ProfesseurHandler implements ProfesseurInterface{
	
	@Autowired
	private ProfesseurRepository professeurRepository;

	@Override
	public Professeur createProfesseur(String nom, String prenom, String sexe, String matricule, Long contact) {
		Professeur prof = professeurRepository.save(new Professeur(nom, prenom, sexe, matricule, contact));
		return prof;
	}
	
	@Override
	public Professeur updateProfesseur(Long id, String nom, String prenom, String sexe, String matricule, Long contact) {
		Professeur prof = professeurRepository.findById(id).get();
		prof.setNom(nom);
		prof.setPrenom(prenom);
		prof.setSexe(sexe);
		prof.setMatricule(matricule);
		prof.setContact(contact);
		return prof;
	}

	@Override
	public void deleteProfesseur(Long id) {
		professeurRepository.deleteById(id);
		
	}


	@Override
	public Professeur readProfesseur(Long id) throws NotFoundException{
		Optional<Professeur> prof = professeurRepository.findById(id);
		if(prof.isPresent()) 
			 return prof.get();
		 else {
			throw new  NotFoundException("Professeur non trouvé");
		 }
	}




}
