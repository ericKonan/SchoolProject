package ci.orbit.schoolproject.business;

import java.util.List;

import ci.orbit.schoolproject.entities.Eleve;

public interface EleveInterface {
	public Eleve createEleve(Eleve eleve);
	public Eleve getEleve(Long id);
	public List<Eleve>  getAllEleve();
	public Eleve updateEleve(Eleve eleve, Long id);
	public void deleteEleve(Long id);
}
