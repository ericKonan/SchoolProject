package ci.orbit.schoolproject.business;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import ci.orbit.schoolproject.dao.InscriptionRepository;
import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Inscription;

public class InscriptionHandler implements InscriptionInterface {
	
	@Autowired
	InscriptionRepository inscriptionRepository;

	@Override
	public Inscription createInscription(@Valid Inscription inscription) {
		return inscriptionRepository.save(inscription);
	}

	@Override
	public Inscription updateInscription(Long id, Inscription inscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inscription getInscription(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inscription> getAllInscriptionByYear(AnneeScolaire annee) {
		// TODO Auto-generated method stub
		return null;
	}

}
