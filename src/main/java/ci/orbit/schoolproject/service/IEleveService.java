package ci.orbit.schoolproject.service;

import java.util.List;
import java.util.Map;

import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Moyenne;
import ci.orbit.schoolproject.entities.Note;

public interface IEleveService {
	public List<Note> noteParMatiere(int idEleve);
	public Map<Matiere, Float> moyMatiereParTrimestre(int idEleve, List<Matiere> matiere, int idTrimestre);
	public float moyenneTrimestrielle(int idEleve, int idTrimestre);
	public float moyenneAnnuelle(int idEleve, List<Moyenne> moyenne);
}
