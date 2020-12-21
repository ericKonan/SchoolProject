package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Professeur;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Long>{

}
