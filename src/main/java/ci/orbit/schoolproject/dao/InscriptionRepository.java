package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Inscription;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

}
