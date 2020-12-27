package ci.orbit.schoolproject.business;

import java.util.Date;
import java.util.List;

import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Salle;

public interface BatimentInterface {
	public Batiment createBatiment(String designation);
	public Batiment readBatiment(Long id);
	public Batiment updateBatiment(Long id, String designation);
	public void deleteBatiment(Long id);
	public List<Salle> listSalle(Long id);
}
