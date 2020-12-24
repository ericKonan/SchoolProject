package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.orbit.schoolproject.entities.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long>  {

}
