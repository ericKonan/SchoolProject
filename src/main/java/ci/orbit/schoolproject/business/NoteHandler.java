package ci.orbit.schoolproject.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ci.orbit.schoolproject.dao.EvaluationRepository;
import ci.orbit.schoolproject.dao.NoteRepository;
import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.EmploiDuTemps;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Moyenne;
import ci.orbit.schoolproject.entities.Note;
import ci.orbit.schoolproject.entities.Trimestre;
import ci.orbit.schoolproject.exception.NotFoundException;

public class NoteHandler implements NoteInterface {
	
	@Autowired
	NoteRepository noteRepository;
	
	@Autowired
	EvaluationRepository evaluationRepository;

	@Override
	public Note createNote(float valeur, int total, String appreciation, Evaluation evaluation, Eleve eleve) {
		Note note = noteRepository.save(new Note(total, valeur, appreciation, evaluation, eleve));
		return note;
	}

	@Override
	public void readNote(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Note updateNote(Long id, float valeur, int total, String appreciation, Evaluation evaluation, Eleve eleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNote(Long id) {
		noteRepository.deleteById(id);

	}

	@Override
	public List<Note> noteByEleve(Eleve eleve) {
		 List<Note> note = noteRepository.findByEleve(eleve);
		return note;
	}

	@Override
	public List<Note> noteByEleveByMatiere(Eleve eleve, Matiere matiere) throws NotFoundException{
		ArrayList<Note> result = new ArrayList<Note>();
		 List<Note> note = noteRepository.findByEleve(eleve);
		 if(!note.isEmpty()) {
			 note.forEach(n->{
				 if (n.getEvaluation().getMatiere() == matiere)
				 result.add(n);
			 });
			 return result;
		 }
		 else {
				throw new NotFoundException("Liste de note non trouvée");
		 }
		
	}

	@Override
	public List<Note> noteByEleveByMatiereByTrimestre(Eleve eleve, Matiere matiere, Trimestre trimestre) throws NotFoundException{
		ArrayList<Note> result = new ArrayList<Note>();
		 List<Note> note = noteRepository.findByEleve(eleve);
		 if(!note.isEmpty()) {
			 note.forEach(n->{
				 if (n.getEvaluation().getMatiere() == matiere && n.getEvaluation().getTrimestre() == trimestre)
				 result.add(n);
			 });
			 return result;
		 }
		 else {
				throw new NotFoundException("Liste de note non trouvée");
		 }
	}



	@Override
	public float getMoyenneTrimestrielle(Eleve eleve, Trimestre trimestre) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMoyenneAnnuelle(Eleve eleve, List<Moyenne> moyenne) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Float getMoyenneMatiere(Eleve eleve, Matiere matiere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Moyenne> getListMoyenne(Eleve eleve, List<Matiere> matiere) {
		// TODO Auto-generated method stub
		return null;
	}

}
