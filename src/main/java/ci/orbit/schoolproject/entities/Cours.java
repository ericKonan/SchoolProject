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

	public Cours(Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe, Matiere matiere,  Trimestre trimestre,
			String observation) {
		super(date, heuredebut, heurefin, professeur, classe, matiere, trimestre);
		this.observation = observation;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}


	@Override
	public String toString() {
		return "Cours [observation=" + observation + "]";
	}
	
	
	
	
}
