package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Inscription;

public interface InscriptionInterface {
	public Inscription createInscription(Inscription inscription);
	public Inscription updateInscription(Long id, Inscription inscription);
	public Inscription getInscription(Long id);
	public List<Inscription> getAllInscriptionByYear(AnneeScolaire annee);
}
