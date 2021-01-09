package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Classe implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private String niveau;
	@ManyToOne
	private Salle salle;
	@OneToMany(mappedBy="classe")
	private List<Inscription> inscriptions;
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classe(String designation, String niveau) {
		super();
		this.designation = designation;
		this.niveau = niveau;
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
		return niveau;
	}
	public void setNiveau(String niveau) {
		niveau = niveau;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	@Override
	public String toString() {
		return "Classe [id=" + id + ", designation=" + designation + ", niveau=" + niveau + ", salle=" + salle
				+ ", inscriptions=" + inscriptions + "]";
	}
	
	
	
	
	
	
}
