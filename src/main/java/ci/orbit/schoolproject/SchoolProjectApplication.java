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

import ci.orbit.schoolproject.business.BatimentInterface;


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

		
		
		// Test crud couche service
		Batiment ba = new Batiment("BATIMENT A");
		Batiment btm1 = batimentInterface.createBatiment(ba);
		Batiment bb = new Batiment("BAT B");
		Batiment btm2 = batimentInterface.createBatiment(bb);
		
		Salle sa = new Salle("Salle 1", btm1);
		Salle s1 = salleInterface.createSalle(sa);
		Salle sb = new Salle("Salle 2", btm1);
		Salle s2 = salleInterface.createSalle(sb);
		Salle sc = new Salle("Salle 3", btm1);
		Salle s3 = salleInterface.createSalle(sc);
		Salle sd = new Salle("Salle 4", btm1);
		Salle s4 = salleInterface.createSalle(sd);
		
		// Test list couche service
		
		//System.out.println("btm2"+ btm2);
		List<Salle> sl = batimentInterface.getListSalle(btm1.getId());			
		 sl.forEach(s->{ 
			 System.out.println(s.getDesignation());
		 });
		

		
	}

}
