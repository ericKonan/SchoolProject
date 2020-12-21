package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Matiere;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Long> {

}
