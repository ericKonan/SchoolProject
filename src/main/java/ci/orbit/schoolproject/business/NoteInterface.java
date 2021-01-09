package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Note;
import ci.orbit.schoolproject.entities.Trimestre;
import ci.orbit.schoolproject.exception.NotFoundException;

public interface NoteInterface {
	public Note createNote(float valeur, int total, String appreciation, Evaluation evaluation, Eleve eleve);
	public void readNote(Long id) throws NotFoundException;
	public Note updateNote(Long id, float valeur, int total, String appreciation, Evaluation evaluation, Eleve eleve);
	public void deleteNote(Long id);
	public List<Note> noteByEleve(Eleve eleve) throws NotFoundException;
	public List<Note> noteByEleveByMatiere(Eleve eleve, Matiere matiere) throws NotFoundException;
	public List<Note> noteByEleveByMatiereByTrimestre(Eleve eleve, Matiere matiere, Trimestre trimestre) throws NotFoundException;
	
}
