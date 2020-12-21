package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Batiment;

@Repository
public interface BatimentRepository extends JpaRepository<Batiment, Long> {

}
