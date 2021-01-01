package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Cours;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long>{
	
}
