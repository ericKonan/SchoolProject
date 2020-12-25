package ci.orbit.schoolproject.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Classe implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private String Niveau;
	@ManyToOne
	private Salle salle;
	
	
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Classe(String designation, String niveau) {
		super();
		this.designation = designation;
		Niveau = niveau;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getNiveau() {
		return Niveau;
	}
	public void setNiveau(String niveau) {
		Niveau = niveau;
	}


	public Salle getSalle() {
		return salle;
	}


	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
}
