package ci.orbit.schoolproject.service;

import java.util.List;
import java.util.Map;

import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Moyenne;
import ci.orbit.schoolproject.entities.Note;

public interface IEleveService {
	public List<Note> getNoteByMatiere(Long idEleve);
	public Map<Matiere, Float> getMoyenneMatiereByTrimestre(Long idEleve, List<Matiere> matiere, Long idTrimestre);
	public float getMoyenneTrimestrielle(Long idEleve, Long idTrimestre);
	public float getMoyenneAnnuelle(Long idEleve, List<Moyenne> moyenne);
}
