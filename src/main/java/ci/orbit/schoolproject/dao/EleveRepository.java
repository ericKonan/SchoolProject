package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Eleve;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long>{

}
