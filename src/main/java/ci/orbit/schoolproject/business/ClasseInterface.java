package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.EmploiDuTemps;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Salle;
import ci.orbit.schoolproject.entities.Semaine;

public interface ClasseInterface {
	public Classe createClasse(String designation, String niveau);
	public Classe readClasse(Long id);
	public Classe updateClasse(Long id, String designation, String niveau);
	public void deleteClasse(Long id);
	public List<Classe> listClasse(Long id);
	public List<Eleve> listEleveByClasse(Long id);
	public List<Matiere> getMatiereByClasse(Long id);
	public List<EmploiDuTemps> getClasseEmploiDuTemps(Classe classe);
	public void setProfesseurCours(Long idClasse, Long idProfesseur, Long idMatiere);
	public void setEvaluationClasse(Long idClasse, Long idProfesseur);
	
}
