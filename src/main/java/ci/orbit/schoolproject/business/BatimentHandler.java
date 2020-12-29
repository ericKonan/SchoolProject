package ci.orbit.schoolproject.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.BatimentRepository;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Salle;
import ci.orbit.schoolproject.exception.NotFoundException;
@Service
@Transactional
public class BatimentHandler implements BatimentInterface {
	@Autowired
	private BatimentRepository batimentRepository;
	
	@Override
	public Batiment createBatiment(String designation) {
		 Batiment batiment = batimentRepository.save(new Batiment(designation));
		 return batiment;
	}

	@Override
	public Batiment readBatiment(Long id) throws NotFoundException{
		 Optional<Batiment> batiment = batimentRepository.findById(id);
		 if(batiment.isPresent()) 
			 return batiment.get();
		 else {
			throw new  NotFoundException("Batiment non trouvé");
		 }
	}

	@Override
	public Batiment updateBatiment(Long id, String designation) {
		Batiment batiment = batimentRepository.findById(id).get();
		batiment.setDesignation(designation);
		return batiment;
	}

	@Override
	public void deleteBatiment(Long id) {
		batimentRepository.deleteById(id);
		
	}

	@Override
	public List<Salle> listSalle(Long id) throws NotFoundException {
		 Optional<Batiment> batiment = batimentRepository.findById(id);
		 if(batiment.isPresent()) 
			 return batiment.get().getSalles();
		 else {
			throw new  NotFoundException("Salles non trouvé");
		 }
	}

}
