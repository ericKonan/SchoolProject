package ci.orbit.schoolproject.business;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.BatimentRepository;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Salle;
import ci.orbit.schoolproject.exception.BatimentException;

@Service
@Transactional
public class BatimentHandler implements BatimentInterface {
	@Autowired
	private BatimentRepository batimentRepository;
	

	@Override
	public Batiment createBatiment(@Valid Batiment batiment) {
		return batimentRepository.save(batiment);
	}



	@Override
	public List<Batiment> getAllBatiments() {
		 return batimentRepository.findAll();
	}



	@Override
	public Batiment getBatimentById(Long id) {
		Optional<Batiment> opt = batimentRepository.findById(id);
		if(!opt.isPresent())
			throw new BatimentException("Batiment introuvable");
		return opt.get();
	}



	@Override
	public Batiment updateBatiment(Batiment batiment, Long id) {
		Optional<Batiment> opt = batimentRepository.findById(id);
		if(!opt.isPresent())
			throw new BatimentException("Batiment supprimé");
		batiment.setId(id);
		return batimentRepository.save(batiment);
		
	}



	@Override
	public void deleteBatiment(Long id) {
		Optional<Batiment> opt = batimentRepository.findById(id);
		if(!opt.isPresent())
			throw new BatimentException("Batiment introuvable");
		batimentRepository.deleteById(id);
	}
	


	@Override
	public List<Salle> getListSalle(Long batimentid) {
		 Optional<Batiment> opt = batimentRepository.findById(batimentid);
		 if(!opt.isPresent()) 
			 throw new BatimentException("Batiment introuvable");
		 return opt.get().getSalles();
		
	}



}
