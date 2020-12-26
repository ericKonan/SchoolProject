package ci.orbit.schoolproject.service;

import java.util.List;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Salle;

public interface IAffectationService {
	public void setClasseAffectation(Long idClasse, Salle salle);
	
}
