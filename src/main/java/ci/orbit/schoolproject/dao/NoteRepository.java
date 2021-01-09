package ci.orbit.schoolproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Note;

public interface NoteRepository  extends JpaRepository<Note, Long> {
	public List<Note> findByEleve(Eleve eleve);
	public List<Note> findByEvaluation(Evaluation Evaluation);
}
