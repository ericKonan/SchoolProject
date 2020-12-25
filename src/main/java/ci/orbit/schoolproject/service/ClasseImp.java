package ci.orbit.schoolproject.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.AnneescolaireRepository;
import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.EleveRepository;
import ci.orbit.schoolproject.dao.InscriptionRepository;
import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Matiere;

@Service
@Transactional
public class ClasseImp implements IClasseService {
	
	@Autowired
	private ClasseRepository classeRepository;
	
	@Autowired
	private EleveRepository eleveRepository;
	
	@Autowired
	private AnneescolaireRepository anneescolaireRepository;
	
	@Autowired
	private InscriptionRepository inscriptionRepository;

	@Override
	public void eleveInscription(Long idEeleve, Long idClasse, Long idAnnee) {
		Eleve elv = eleveRepository.getOne(idEeleve);
		Classe cls = classeRepository.getOne(idClasse);
		AnneeScolaire as = anneescolaireRepository.getOne(idAnnee);
		inscriptionRepository.save(new Inscription(new Date(), cls, elv, as));
	}

	@Override
	public List<Eleve> eleveParClasse(int idClasse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matiere> emploiDtParClasse(int idClasse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void faireCours(int idClasse, int idProfesseur, int idMatiere) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void evaluerClasse(int idClasse, int idProfesseur) {
		// TODO Auto-generated method stub
		
	}

}
