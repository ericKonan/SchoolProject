package ci.orbit.schoolproject.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.entities.Trimestre;
import ci.orbit.schoolproject.exception.NotFoundException;

public interface EvaluationInterface {
	public Evaluation createEvaluation(Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere, Trimestre trimestre, String observation);
	public Evaluation readEvaluation(Long id) throws NotFoundException;
	public Evaluation updateEvaluation(Long id, Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere, Trimestre trimestre, String observation);
	public void deleteEvaluation(Long id);
	public List<Evaluation> listEvaluationByProfesseur(Professeur professeur);
	public List<Evaluation> listEvaluationByClasse(Classe classe);
}
