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
import ci.orbit.schoolproject.exception.NotFoundException;

public interface ClasseInterface {
	public Classe createClasse(String designation, String niveau);
	public Classe readClasse(Long id);
	public Classe updateClasse(Long id, String designation, String niveau);
	public void deleteClasse(Long id);
	public List<Classe> listClasse(Long id);
	public List<Eleve> listEleveByClasse(Classe classe,AnneeScolaire annee) throws NotFoundException;
	public List<Matiere> getMatiereByClasse(Classe classe) throws NotFoundException;
	public List<EmploiDuTemps> getClasseEmploiDuTemps(Classe classe) throws NotFoundException;
	public void setProfesseurCours(Long idClasse, Long idProfesseur, Long idMatiere);
	public void setEvaluationClasse(Long idClasse, Long idProfesseur);
	
}
