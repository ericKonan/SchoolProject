package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Cours extends Activite implements Serializable{
	private String observation;

	public Cours(String observation) {
		super();
	}

	

	public Cours(Long id, Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere, String observation) {
		super(id, date, heuredebut, heurefin, professeur, classe, matiere);
		this.observation = observation;
	}



	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	
}
