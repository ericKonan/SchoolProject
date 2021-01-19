package ci.orbit.schoolproject.business;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	public Batiment createBatiment(Batiment batiment) {
		return batimentRepository.save(batiment);
	}



	@Override
	public List<Batiment> getAllBatiments() {
		 List<Batiment> list = batimentRepository.findAll().stream().collect(Collectors.toList());
		 return list;
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
		return batimentRepository.save(batiment);
		
	}



	@Override
	public void deleteBatiment(Long id) {
		Optional<Batiment> opt = batimentRepository.findById(id);
		if(!opt.isPresent())
			throw new BatimentException("Batiment deja supprimé");
		batimentRepository.deleteById(id);
	}
	


	@Override
	public List<Salle> getListSalle(Long id) {
		 Optional<Batiment> opt = batimentRepository.findById(id);
		 if(!opt.isPresent()) 
			 throw new BatimentException("Batiment introuvable");
		 return opt.get().getSalles();
		
	}



}
