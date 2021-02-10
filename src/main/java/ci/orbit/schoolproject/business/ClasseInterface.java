package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.EmploiDuTemps;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.entities.Salle;

public interface ClasseInterface {
	public Classe createClasse(Classe classe);
	public Classe updateClasse(Classe classe, Long id);
	public Classe getClasse(Long id);
	public void deleteClasse(Long id);
	public List<Classe> getAllClasse(Long id);
	public List<Eleve> getElevesByClasse(Classe classe);
	public List<Matiere> getMatiereByClasse(Classe classe);
	public List<EmploiDuTemps> getClasseEmploiDuTemps(Classe classe);
	public void setClasseAffectation(Long id, Salle salle);
	public void setProfesseurCours(Classe classe, Professeur professeur, Matiere matiere);
	public void setEvaluationClasse(Classe classe, Professeur professeur);
	
}
