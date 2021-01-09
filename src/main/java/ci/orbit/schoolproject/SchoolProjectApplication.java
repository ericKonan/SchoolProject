package ci.orbit.schoolproject;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
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
import ci.orbit.schoolproject.business.EmploiDuTempsInterface;
import ci.orbit.schoolproject.business.MatiereInterface;

import ci.orbit.schoolproject.dao.SalleRepository;

import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Eleve;
import ci.orbit.schoolproject.entities.EmploiDuTemps;

import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Salle;
import ci.orbit.schoolproject.entities.Semaine;
import ci.orbit.schoolproject.exception.NotFoundException;

@SpringBootApplication
public class SchoolProjectApplication implements CommandLineRunner {
	@Autowired
	private BatimentInterface batimentInterface;
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private ClasseInterface classeInterface;
	
	@Autowired
	private EleveInterface eleveInterface;
	
	@Autowired
	private AnneeSoclaireInterface anneeSoclaireInterface;
	
	@Autowired
	private SalleInterface salleInterface;
	
	@Autowired
	private MatiereInterface matiereInterface;
	
	@Autowired
	private EmploiDuTempsInterface emploiDuTempsInterface;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Classe cl1 = classeInterface.createClasse( "6eme 1", "6e");
		Classe cl2 = classeInterface.createClasse( "6eme 2", "6e" );
		Classe cl3 = classeInterface.createClasse( "5eme", "5e");
		Classe cl4 = classeInterface.createClasse( "4eme", "4e") ;
		
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
		Eleve e4 = eleveInterface.createEleve("Kevin","Durant","M",today);
		Eleve e5 = eleveInterface.createEleve("Lebron","James","M",today);
		
		salleInterface.setClasseAffectation(cl1.getId(), s2);
		salleInterface.setClasseAffectation(cl2.getId(), s3);
		
		eleveInterface.setEleveInscription(e2.getIdentifiant(), cl1.getId(), as.getId());
		eleveInterface.setEleveInscription(e1.getIdentifiant(), cl1.getId(), as.getId());
		eleveInterface.setEleveInscription(e3.getIdentifiant(), cl2.getId(), as.getId());
		try {
		List<Eleve> elv = classeInterface.listEleveByClasse(cl1, as);			
		 elv.forEach(s->{ 
			 System.out.println(s.getNom()+" "+s.getPrenom());
		 });
		} catch (Exception e){
			throw new NotFoundException("Aucune liste d'eleves trouvé");
		}
		
		System.out.println("/////////////////////////////////////");
		
		
		Matiere m1 = matiereInterface.createMatiere("Anglais");
		Matiere m2 = matiereInterface.createMatiere("Mathematiques");
		Matiere m3 = matiereInterface.createMatiere("Physique/Chimie");
		Matiere m4 = matiereInterface.createMatiere("Français");
		Date dt = new Date(); 
		LocalTime tm = LocalTime.now(); 
		emploiDuTempsInterface.createEmploiDT("Lundi", tm, tm, cl1, m1);
		emploiDuTempsInterface.createEmploiDT("Lundi", tm, tm, cl1, m2);
		emploiDuTempsInterface.createEmploiDT("Mardi", tm, tm, cl1, m3);
		emploiDuTempsInterface.createEmploiDT("Mardi", tm, tm, cl1, m4);
		
		try {
		List<Matiere> mat = classeInterface.getMatiereByClasse(cl1);	
		 mat.forEach(s->{ 
			 System.out.println(s.getDesignation());
		 });
		} catch (Exception e){
			throw new NotFoundException("Aucune liste d'eleves trouvé");
		}
		System.out.println("/////////////////////////////////////");
		try {
			List<EmploiDuTemps> emp = classeInterface.getClasseEmploiDuTemps(cl1);	
			emp.forEach(s->{ 
				 System.out.println(s.getJour()+" "+s.getHeuredebut()+" "+s.getHeurefin()+" "+s.getMatiere().getDesignation());
			 });
			} catch (Exception e){
				throw new NotFoundException("Aucune liste d'eleves trouvé");
			}
		
	}

}
