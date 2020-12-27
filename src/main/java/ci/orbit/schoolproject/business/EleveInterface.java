package ci.orbit.schoolproject.business;

import java.util.Date;
import java.util.List;
import java.util.Map;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Moyenne;
import ci.orbit.schoolproject.entities.Note;

public interface EleveInterface {
	public Eleve createEleve(String nom, String prenom, String sexe, Date dateNaissance);
	public Eleve readEleve(Long id);
	public Eleve updateEleve(Long id, String nom, String prenom, String sexe, Date dateNaissance);
	public void deleteEleve(Long id);
	public Note createNote(float valeur, int total, String appreciation, Evaluation evaluation, Eleve eleve);
	public Note updateNote(int id, float valeur, int total, String appreciation, Evaluation evaluation, Eleve eleve);
	public void deleteNote(Long idNote);
	public Inscription setEleveInscription(Long idEeleve, Long idClasse, Long idAnnee );
	public List<Note> getNoteByMatiere(Long idEleve);
	public Map<Matiere, Float> getMoyenneMatiereByTrimestre(Long idEleve, List<Matiere> matiere, Long idTrimestre);
	public float getMoyenneTrimestrielle(Long idEleve, Long idTrimestre);
	public float getMoyenneAnnuelle(Long idEleve, List<Moyenne> moyenne);
}
