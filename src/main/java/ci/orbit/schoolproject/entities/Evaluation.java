package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Evaluation extends Activite implements Serializable{
	private String type_evaluation;
	@OneToMany(mappedBy="evaluation")
	private List<Note> notes;

	public Evaluation() {
		super();
	}

	public Evaluation(Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere,  Trimestre trimestre, String type_evaluation) {
		super(date, heuredebut, heurefin, professeur, classe, matiere, trimestre);
		this.type_evaluation = type_evaluation;
	
	}

	public String getType_evaluation() {
		return type_evaluation;
	}

	public void setType_evaluation(String type_evaluation) {
		this.type_evaluation = type_evaluation;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Evaluation [type_evaluation=" + type_evaluation + ", notes=" + notes + "]";
	}

	

	
	
}
