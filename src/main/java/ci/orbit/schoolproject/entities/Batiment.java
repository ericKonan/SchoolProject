package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Batiment implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	@OneToMany(mappedBy = "batiment")
	private List<Salle> salles;
	
	public Batiment(String designation) {
		super();
		this.designation = designation;
	}
	public List<Salle> getSalles() {
		return salles;
	}
	public void setSalles(List<Salle> salles) {
		this.salles = salles;
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
	
}
