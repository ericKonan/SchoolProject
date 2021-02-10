package ci.orbit.schoolproject.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ci.orbit.schoolproject.dao.EleveRepository;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.exception.EleveNotFoundException;
import ci.orbit.schoolproject.exception.EleveNotFoundException;

public class EleveHandler implements EleveInterface {
	@Autowired
	EleveRepository eleveRepository;

	@Override
	public Eleve createEleve(Eleve eleve) {
		return eleveRepository.save(eleve);
	}

	@Override
	public Eleve getEleve(Long id) {
		Optional<Eleve> opt = eleveRepository.findById(id);
		if(!opt.isPresent())
			throw new EleveNotFoundException("Eleve introuvable");
		return opt.get();
	}

	@Override
	public List<Eleve> getAllEleve() {
		return eleveRepository.findAll();
	}

	@Override
	public Eleve updateEleve(Eleve eleve, Long id) {
		Optional<Eleve> opt = eleveRepository.findById(id);
		if(!opt.isPresent())
			throw new EleveNotFoundException("Eleve supprimé");
		eleve.setIdentifiant(id);
		return eleveRepository.save(eleve);
	}

	@Override
	public void deleteEleve(Long id) {
		eleveRepository.deleteById(id);

	}

	

}
