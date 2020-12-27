package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.entities.Cours;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Evaluation;

public interface ProfesseurInterface {
	public Professeur createProfesseur(String designation);
	public Professeur updateProfesseur(Long id, String designation);
	public void deleteProfesseur(Long id);
	public List<Cours> listCoursByProfesseur(Long id);
	public List<Evaluation> listEvaluationByProfesseur(Long id);
}
