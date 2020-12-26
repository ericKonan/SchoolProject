package ci.orbit.schoolproject;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ci.orbit.schoolproject.dao.AnneescolaireRepository;
import ci.orbit.schoolproject.dao.BatimentRepository;
import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.CoursRepository;
import ci.orbit.schoolproject.dao.EleveRepository;
import ci.orbit.schoolproject.dao.EmploiDuTempsRepository;
import ci.orbit.schoolproject.dao.EvaluationRepository;
import ci.orbit.schoolproject.dao.InscriptionRepository;
import ci.orbit.schoolproject.dao.MatiereRepository;
import ci.orbit.schoolproject.dao.MoyenneRepository;
import ci.orbit.schoolproject.dao.NoteRepository;
import ci.orbit.schoolproject.dao.ProfesseurRepository;
import ci.orbit.schoolproject.dao.SalleRepository;
import ci.orbit.schoolproject.dao.TrimestreRepository;
import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.Inscription;
import ci.orbit.schoolproject.entities.Salle;
import ci.orbit.schoolproject.service.IAffectationService;
import ci.orbit.schoolproject.service.IClasseService;

@SpringBootApplication
public class SchoolProjectApplication implements CommandLineRunner {
	@Autowired
	private BatimentRepository batimentRepository;
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private ClasseRepository classeRepository;
	
	@Autowired
	private EleveRepository eleveRepository;
	
	@Autowired
	private ProfesseurRepository professeurRepository;
	
	@Autowired
	private MatiereRepository matiereRepository;
	
	@Autowired
	private EmploiDuTempsRepository emploiDuTempsRepository;
	
	@Autowired
	private NoteRepository noteRepository;
	
	@Autowired
	private EvaluationRepository evaluationRepository;
	
	@Autowired
	private MoyenneRepository moyenneRepository;
	
	@Autowired
	private TrimestreRepository trimestreRepository;
	
	@Autowired
	private InscriptionRepository inscriptionRepository;
	
	@Autowired
	private CoursRepository coursRepository;
	
	@Autowired
	private AnneescolaireRepository anneescolaireRepository;
	
	@Autowired
	private IAffectationService iAffectationService;
	
	@Autowired
	private IClasseService iClasseService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Test couche DAO
		Batiment b1 = batimentRepository.save(new Batiment("Batiment A"));
		
		Salle s1 = salleRepository.save(new Salle("Salle A", b1));
		Salle s2 = salleRepository.save(new Salle("Salle B", b1));
		Salle s3 = salleRepository.save(new Salle("Salle C", b1));
		Salle s4 = salleRepository.save(new Salle("Salle D", b1));
		
		Date today = new Date();
		Eleve e1 = eleveRepository.save(new Eleve("Dilmar","DeRozan","M",today));
		Eleve e2 = eleveRepository.save(new Eleve("Stephen","Curry","M",today));
		Eleve e3 = eleveRepository.save(new Eleve("Chris","Paul","M",today));
		
		Classe cl1 = classeRepository.save( new Classe("6eme 1", "6e") );
		Classe cl2 = classeRepository.save( new Classe("6eme 2", "6e") );
		Classe cl3 = classeRepository.save( new Classe("5eme", "5e") );
		Classe cl4 = classeRepository.save( new Classe("4eme", "4e") );
		
		AnneeScolaire as = anneescolaireRepository.save(new AnneeScolaire("2020-2021"));
		
		inscriptionRepository.listEleveByClasse(cl1.getId()).forEach(ins->{
			System.out.println(ins.getNom());
		});;
		
		// Test couche service
		iAffectationService.affecterClasse((long) 1, s2);
		iClasseService.setEleveInscription(e2.getIdentifiant(), cl1.getId(), as.getId());
		iClasseService.setEleveInscription(e1.getIdentifiant(), cl1.getId(), as.getId());
		iClasseService.setEleveInscription(e3.getIdentifiant(), cl2.getId(), as.getId());
		
	}

}
