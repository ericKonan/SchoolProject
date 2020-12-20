package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.orbit.schoolproject.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

}
