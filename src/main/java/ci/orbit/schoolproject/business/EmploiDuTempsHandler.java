package ci.orbit.schoolproject.business;

import java.sql.Time;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.EleveRepository;
import ci.orbit.schoolproject.dao.EmploiDuTempsRepository;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.EmploiDuTemps;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.exception.NotFoundException;

@Service
@Transactional
public class EmploiDuTempsHandler implements EmploiDuTempsInterface{
	
	@Autowired
	private EmploiDuTempsRepository emploiDuTempsRepository;

	@Override
	public EmploiDuTemps createEmploiDT(String jour, Time heuredebut, Time heurefin, Classe classe, Matiere matiere) {
		EmploiDuTemps empdt = emploiDuTempsRepository.save(new EmploiDuTemps(jour, heuredebut, heurefin, classe, matiere));
		return empdt;
	}

	@Override
	public EmploiDuTemps readEmploiDT(Long id) throws NotFoundException {
		Optional<EmploiDuTemps> emp = emploiDuTempsRepository.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			throw new NotFoundException("Matière non trouvé");
		}
	}

	@Override
	public EmploiDuTemps updateEmploiDT(Long id, String jour, Time heuredebut, Time heurefin, Classe classe,
			Matiere matiere) {
		EmploiDuTemps emp = emploiDuTempsRepository.findById(id).get();
		emp.setClasse(classe);
		emp.setMatiere(matiere);
		emp.setHeuredebut(heuredebut);
		emp.setHeurefin(heurefin);
		emp.setJour(jour);
		return emp;
	}

	@Override
	public void deleteEmploiDT(Long id) {
		emploiDuTempsRepository.deleteById(id);
	}


}
