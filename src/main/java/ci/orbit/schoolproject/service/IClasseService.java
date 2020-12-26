package ci.orbit.schoolproject.service;

import java.util.List;

import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Matiere;

public interface IClasseService {
	public void setEleveInscription(Long idEeleve, Long idClasse, Long idAnnee );
	public List<Eleve> listEleveByClasse(Long idClasse, Inscription inscription);
	public List<Matiere> getEmploiDuTempsByClasse(Long idClasse);
	public void setProfesseurCours(Long idClasse, Long idProfesseur, Long idMatiere);
	public void setEvaluationClasse(Long idClasse, Long idProfesseur);
	
}
