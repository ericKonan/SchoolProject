package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.orbit.schoolproject.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long>{

}
