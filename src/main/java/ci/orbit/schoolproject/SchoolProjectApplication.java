package ci.orbit.schoolproject;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ci.orbit.schoolproject.business.SalleInterface;
import ci.orbit.schoolproject.business.AnneeSoclaireInterface;
import ci.orbit.schoolproject.business.BatimentInterface;
import ci.orbit.schoolproject.business.ClasseInterface;
import ci.orbit.schoolproject.business.EleveInterface;
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
import ci.orbit.schoolproject.exception.NotFoundException;

@SpringBootApplication
public class SchoolProjectApplication implements CommandLineRunner {
	@Autowired
	private BatimentInterface batimentInterface;
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private ClasseRepository classeRepository;
	
	@Autowired
	private EleveInterface eleveInterface;
	
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
	private CoursRepository coursRepository;
	
	@Autowired
	private AnneeSoclaireInterface anneeSoclaireInterface;
	
	@Autowired
	private SalleInterface salleInterface;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Test couche DAO
		//Batiment b1 = batimentRepository.save(new Batiment("Batiment A"));
		

		
		Classe cl1 = classeRepository.save( new Classe("6eme 1", "6e") );
		Classe cl2 = classeRepository.save( new Classe("6eme 2", "6e") );
		Classe cl3 = classeRepository.save( new Classe("5eme", "5e") );
		Classe cl4 = classeRepository.save( new Classe("4eme", "4e") );
		
		AnneeScolaire as = anneeSoclaireInterface.createAnneeScolaire("2020-2021");
		
		
		// Test couche service
		Batiment btm1 = batimentInterface.createBatiment("BAT A");
		Batiment btm2 = batimentInterface.createBatiment("BAT B");
		
		Salle s1 = salleRepository.save(new Salle("Salle A", btm1));
		Salle s2 = salleRepository.save(new Salle("Salle B", btm1));
		Salle s3 = salleRepository.save(new Salle("Salle C", btm1));
		Salle s4 = salleRepository.save(new Salle("Salle D", btm2));
		
		
		Date today = new Date();
		Eleve e1 = eleveInterface.createEleve("Dilmar","DeRozan","M",today);
		Eleve e2 = eleveInterface.createEleve("Stephen","Curry","M",today);
		Eleve e3 = eleveInterface.createEleve("Chris","Paul","M",today);
		
		
		salleInterface.setClasseAffectation(cl1.getId(), s2);
		salleInterface.setClasseAffectation(cl2.getId(), s3);
		
		eleveInterface.setEleveInscription(e2.getIdentifiant(), cl1.getId(), as.getId());
		eleveInterface.setEleveInscription(e1.getIdentifiant(), cl1.getId(), as.getId());
		eleveInterface.setEleveInscription(e3.getIdentifiant(), cl2.getId(), as.getId());
		
		try {
			 List<Eleve> elv = anneeSoclaireInterface.listEleveByAnnee(as);			
			 elv.forEach(s->{ 
				 System.out.println(s.getNom()+" "+s.getPrenom());
			 });
			 
		}catch (NotFoundException e){
			System.out.println(e.getMessage());
		}
	}

}
