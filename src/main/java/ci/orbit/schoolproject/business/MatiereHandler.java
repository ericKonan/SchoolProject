package ci.orbit.schoolproject.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.MatiereRepository;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.exception.NotFoundException;

@Service
@Transactional
public class MatiereHandler implements MatiereInterface {
	
	@Autowired
	private MatiereRepository matiereRepository;

	@Override
	public Matiere createMatiere(String libelle) {
		Matiere m = matiereRepository.save(new Matiere(libelle));
		return m;
	}

	@Override
	public Matiere updateMatiere(Long id, String libelle) {
		Matiere m = matiereRepository.findById(id).get();
		m.setDesignation(libelle);
		return m;
	}

	@Override
	public void deleteMatiere(Long id) {
		matiereRepository.deleteById(id);
		
	}

	@Override
	public List<Matiere> getMatiereList() {
		return matiereRepository.findAll();
	}

	@Override
	public Matiere readMatiere(Long id) throws NotFoundException{
		Optional<Matiere> m = matiereRepository.findById(id);
		if(m.isPresent()) {
			return m.get();
		}else {
			throw new NotFoundException("Matière non trouvé");
		}
	}
	
}
