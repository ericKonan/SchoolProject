package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.exception.NotFoundException;

public interface MatiereInterface {
	public Matiere createMatiere(String libelle);
	public Matiere readMatiere(Long id) throws NotFoundException;
	public Matiere updateMatiere(Long id, String libelle);
	public void deleteMatiere(Long id);	
	public List<Matiere> getMatiereList();

}
