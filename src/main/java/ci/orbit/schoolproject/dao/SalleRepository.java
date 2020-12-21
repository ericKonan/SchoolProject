package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Salle;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long> {

}
