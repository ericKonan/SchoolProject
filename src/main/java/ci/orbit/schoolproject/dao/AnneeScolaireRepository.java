package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.AnneeScolaire;

@Repository
public interface AnneeScolaireRepository extends JpaRepository<AnneeScolaire, Long> {

}
