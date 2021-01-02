package ci.orbit.schoolproject.business;


import java.time.LocalTime;

import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.EmploiDuTemps;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.exception.NotFoundException;

public interface EmploiDuTempsInterface {
	public EmploiDuTemps createEmploiDT(String jour, LocalTime heuredebut, LocalTime heurefin, Classe classe, Matiere matiere);
	public EmploiDuTemps readEmploiDT(Long id) throws NotFoundException ;
	public EmploiDuTemps updateEmploiDT(Long id, String jour, LocalTime heuredebut, LocalTime heurefin, Classe classe, Matiere matiere);
	public void deleteEmploiDT(Long id);

}
