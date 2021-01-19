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
	private SalleInterface salleInterface;
	

	
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		
		// Test couche service
		Batiment btm1 = batimentInterface.createBatiment("BAT A");
		Batiment btm2 = batimentInterface.createBatiment("BAT B");
		
		Salle s1 = salleRepository.save(new Salle("Salle A", btm1));
		Salle s2 = salleRepository.save(new Salle("Salle B", btm1));
		Salle s3 = salleRepository.save(new Salle("Salle C", btm1));
		Salle s4 = salleRepository.save(new Salle("Salle D", btm2));
		

		

		
	}

}
