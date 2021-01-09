package ci.orbit.schoolproject.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ci.orbit.schoolproject.dao.EvaluationRepository;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Cours;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.entities.Trimestre;

public class EvaluationHandler implements EvaluationInterface {
	
	@Autowired
	EvaluationRepository evaluationRepository;

	@Override
	public Evaluation createEvaluation(Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere, Trimestre trimestre, String type_evaluation) {
		Evaluation eval = evaluationRepository.save(new Evaluation(date, heuredebut, heurefin, professeur, classe, matiere, trimestre, type_evaluation) );
			return eval;
	}

	@Override
	public Evaluation readEvaluation(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evaluation updateEvaluation(Long id, Date date, Time heuredebut, Time heurefin, Professeur professeur,
			Classe classe, Matiere matiere, Trimestre trimestre, String type_evaluation) {
		Evaluation eval = evaluationRepository.findById(id).get();
		 eval.setDate(date);
		 eval.setHeuredebut(heuredebut);
		 eval.setHeurefin(heurefin);
		 eval.setMatiere(matiere);
		 eval.setProfesseur(professeur);
		 eval.setType_evaluation(type_evaluation);
		 return eval;
	}

	@Override
	public void deleteEvaluation(Long id) {
		evaluationRepository.deleteById(id);

	}

	@Override
	public List<Evaluation> listEvaluationByClasse(Classe classe) {
		List<Evaluation> eval = evaluationRepository.findByClasse(classe);
		return eval;
	}

	@Override
	public List<Evaluation> listEvaluationByProfesseur(Professeur professeur) {
		List<Evaluation> eval = evaluationRepository.findByProfesseur(professeur);
		return eval;
	}

}
