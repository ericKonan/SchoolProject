package ci.orbit.schoolproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.EmploiDuTemps;

@Repository
public interface EmploiDuTempsRepository extends JpaRepository<EmploiDuTemps, Long> {
	public List<EmploiDuTemps> findByClasse(Classe classe);
}
