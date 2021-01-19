package ci.orbit.schoolproject.business;

import java.util.Date;
import java.util.List;

import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Salle;
import ci.orbit.schoolproject.exception.NotFoundException;

public interface BatimentInterface {
	public Batiment createBatiment(Batiment batiment);
	public List<Batiment> getAllBatiments();
	public Batiment getBatimentById(Long id) ;
	public Batiment updateBatiment(Batiment batiment, Long id);
	public void deleteBatiment(Long id);
	public List<Salle> getListSalle(Long id);
}
