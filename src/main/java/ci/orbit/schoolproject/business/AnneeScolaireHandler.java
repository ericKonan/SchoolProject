package ci.orbit.schoolproject.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.AnneeScolaireRepository;
import ci.orbit.schoolproject.dao.EleveRepository;
import ci.orbit.schoolproject.dao.InscriptionRepository;
import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.exception.NotFoundException;
@Service
@Transactional
public class AnneeScolaireHandler implements AnneeSoclaireInterface{

	
	@Autowired
	private AnneeScolaireRepository anneeScolaireRepository;
	
	@Autowired
	private InscriptionRepository inscriptionRepository;


	@Override
	public AnneeScolaire createAnneeScolaire(String designation) {
		AnneeScolaire annee = anneeScolaireRepository.save(new AnneeScolaire(designation));
		 return annee;
	}

	@Override
	public AnneeScolaire updateAnneeScolaire(Long id, String designation) {
		AnneeScolaire annee = anneeScolaireRepository.findById(id).get();
		annee.setDesignation(designation);
		return annee;
	}

	@Override
	public void deleteAnneeScolaire(Long id) {
		anneeScolaireRepository.deleteById(id);
		
	}

	@Override
	public List<Eleve> listEleveByAnnee(AnneeScolaire annee) throws NotFoundException {
		ArrayList<Eleve> eleves = new ArrayList<Eleve>();
		List<Inscription> inscription = inscriptionRepository.findByAnneeScolaire(annee);
		if(!inscription.isEmpty()) {		
			inscription.forEach(e->{eleves.add(e.getEleve());});
			return eleves;
		}
		else{
			throw new NotFoundException("Liste d'élèves non trouvée");
		}
	}

}
