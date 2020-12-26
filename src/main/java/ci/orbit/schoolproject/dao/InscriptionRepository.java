package ci.orbit.schoolproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Inscription;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
	
	@Query("select e from Inscription i join i.eleve e where  i.classe.id = :idClasse")
	public List<Eleve> listEleveByClasse(@Param("idClasse") Long idClasse);
	
	public List<Inscription> findByClasse(Classe classe);

}
