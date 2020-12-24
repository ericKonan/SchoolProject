package ci.orbit.schoolproject.service;

import java.util.List;

import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Matiere;

public interface IClasseService {
	public void eleveInscription(int idEeleve, int idClasse);
	public List<Eleve> eleveParClasse(int idClasse);
	public List<Matiere> emploiDtParClasse(int idClasse);
	public void faireCours(int idClasse, int idProfesseur, int idMatiere);
	public void evaluerClasse(int idClasse, int idProfesseur);
	
}
