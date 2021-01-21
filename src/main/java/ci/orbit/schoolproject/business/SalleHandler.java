package ci.orbit.schoolproject.business;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.SalleRepository;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Salle;
import ci.orbit.schoolproject.exception.BatimentException;
import ci.orbit.schoolproject.exception.SalleException;

@Service
@Transactional
public class SalleHandler implements SalleInterface{
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private ClasseRepository classeRepository;

	

	@Override
	public Salle createSalle(@Valid Salle salle) {
		return salleRepository.save(salle);
	}



	@Override
	public Salle updateSAlle(@Valid Salle salle, Long id) {
		Optional<Salle> opt = salleRepository.findById(id);
		if(!opt.isPresent())
			throw new SalleException("Salle supprimée");
		return salleRepository.save(salle);
	}


	@Override
	public List<Salle> getAllSalle() {
		List<Salle> list = salleRepository.findAll().stream().collect(Collectors.toList());
		return list;
	}



	@Override
	public Salle getSalleById(Long id) {
		Optional<Salle> opt = salleRepository.findById(id);
		if(!opt.isPresent())
			throw new SalleException("Salle supprimée");
		return opt.get();
	}

	@Override
	public void deleteSalle(Long id) {
		Optional<Salle> opt = salleRepository.findById(id);
		if(!opt.isPresent())
			throw new SalleException("Salle deja supprimée");
		salleRepository.deleteById(id);
	}



	@Override
	public void setClasseAffectation(Long idClasse, Salle salle) {
		// TODO Auto-generated method stub
		
	}

}
