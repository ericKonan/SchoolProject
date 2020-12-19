package ci.orbit.schoolproject;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ci.orbit.schoolproject.dao.BatimentRepository;
import ci.orbit.schoolproject.dao.EleveRepository;
import ci.orbit.schoolproject.dao.SalleRepository;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Eleve;

@SpringBootApplication
public class SchoolProjectApplication implements CommandLineRunner {
	@Autowired
	private BatimentRepository batimentRepository;
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private EleveRepository eleveRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		batimentRepository.save(new Batiment(null,"Batiment A",null));
		Date today = new Date();
		eleveRepository.save(new Eleve(null,"Dilmar","DeRozan","M",52,today));
		eleveRepository.save(new Eleve(null,"Stephen","Curry","M",51,today));
		eleveRepository.save(new Eleve(null,"Chris","Paul","M",50,today));
	}

}
