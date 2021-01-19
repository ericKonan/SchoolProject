package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Salle;

public interface SalleInterface {
	public Salle createSalle(Salle salle);
	public Salle updateSAlle(Salle salle, Long id);
	public List<Salle> getAllSalle();
	public Salle getSalleById(Long id);
	public void deleteSalle(Long id);
	public void setClasseAffectation(Long idClasse, Salle salle);
	
}
