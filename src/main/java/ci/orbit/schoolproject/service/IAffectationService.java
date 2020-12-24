package ci.orbit.schoolproject.service;

import java.util.List;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Salle;

public interface IAffectationService {
	public void affecterSalle(int idBatiment, List<Salle> salles);
	public void affecterClasse(int idClasse, int idSalle);
	
}
