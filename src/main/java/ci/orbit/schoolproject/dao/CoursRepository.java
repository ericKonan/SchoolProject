package ci.orbit.schoolproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Cours;
import ci.orbit.schoolproject.entities.Professeur;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long>{
	public List<Cours> findByProfesseur(Professeur professeur);
	public List<Cours> findByClasse(Classe classe);
}
