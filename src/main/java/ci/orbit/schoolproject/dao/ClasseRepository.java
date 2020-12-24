package ci.orbit.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.orbit.schoolproject.entities.Classe;

public interface ClasseRepository  extends JpaRepository<Classe, Long> {

}
