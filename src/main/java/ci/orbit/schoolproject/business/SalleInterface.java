package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Salle;

public interface SalleInterface {
	public Salle createSalle(String designation, Batiment batiment);
	public Salle updateSAlle(Long id, String designation, Batiment batiment);
	public void deleteSalle(Long id);
	public void setClasseAffectation(Long idClasse, Salle salle);
	
}
