package ci.orbit.schoolproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.entities.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long>  {
	public List<Evaluation> findByClasse(Classe classe);
	public List<Evaluation> findByProfesseur(Professeur professeur);
}
