package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.exception.NotFoundException;
import ci.orbit.schoolproject.entities.Cours;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Evaluation;

public interface ProfesseurInterface {
	public Professeur createProfesseur(String name, String prenom, String sexe, String matricule, Long contact);
	public Professeur readProfesseur(Long id) throws NotFoundException;
	public Professeur updateProfesseur(Long id, String nom, String prenom, String sexe, String matricule, Long contact);
	public void deleteProfesseur(Long id);
	
}
