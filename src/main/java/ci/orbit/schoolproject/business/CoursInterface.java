package ci.orbit.schoolproject.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Cours;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.entities.Trimestre;
import ci.orbit.schoolproject.exception.NotFoundException;

public interface CoursInterface {
	public Cours createCours(Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere, Trimestre trimestre, String type_evaluation);
	public Cours readCours(Long id) throws NotFoundException;
	public Cours updateCours(Long id, Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere, Trimestre trimestre, String observation);
	public void deleteCours(Long id);
	public List<Cours> listCoursByProfesseur(Professeur professeur);
	public List<Cours> listCoursByClasse(Classe classe);
}
