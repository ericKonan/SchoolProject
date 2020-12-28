package ci.orbit.schoolproject.business;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Moyenne;
import ci.orbit.schoolproject.entities.Note;
@Service
@Transactional
public class ELeveHandler implements EleveInterface {
	
	@Autowired
	private ClasseRepository classeRepository;
	
	@Autowired
	private EleveRepository eleveRepository;
	
	@Autowired
	private AnneescolaireRepository anneescolaireRepository;
	
	@Autowired
	private InscriptionRepository inscriptionRepository;

	@Override
	public Eleve createEleve(String nom, String prenom, String sexe, Date dateNaissance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Eleve readEleve(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Eleve updateEleve(Long id, String nom, String prenom, String sexe, Date dateNaissance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEleve(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Inscription setEleveInscription(Long idEeleve, Long idClasse, Long idAnnee) {
		Eleve elv = eleveRepository.getOne(idEeleve);
		Classe cls = classeRepository.getOne(idClasse);
		AnneeScolaire as = anneescolaireRepository.getOne(idAnnee);
		return inscriptionRepository.save(new Inscription(new Date(), cls, elv, as));
	}

	@Override
	public List<Note> getNoteByMatiere(Long idEleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Matiere, Float> getMoyenneMatiereByTrimestre(Long idEleve, List<Matiere> matiere, Long idTrimestre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getMoyenneTrimestrielle(Long idEleve, Long idTrimestre) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMoyenneAnnuelle(Long idEleve, List<Moyenne> moyenne) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Note createNote(float valeur, int total, String appreciation, Evaluation evaluation, Eleve eleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note updateNote(int id, float valeur, int total, String appreciation, Evaluation evaluation, Eleve eleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNote(Long idNote) {
		// TODO Auto-generated method stub
		
	}

}
