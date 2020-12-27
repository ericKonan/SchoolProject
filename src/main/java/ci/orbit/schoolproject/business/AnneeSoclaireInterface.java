package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Eleve;

public interface AnneeSoclaireInterface {
	public AnneeScolaire createAnneeScolaire(String designation);
	public AnneeScolaire updateAnneeScolaire(Long id, String designation);
	public void deleteAnneeScolaire(Long id);
	public List<Eleve> listEleveByAnnescolaire(Long id);

}
