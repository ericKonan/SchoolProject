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
public class Salle implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	@ManyToOne
	private Batiment batiment;
	@OneToMany(mappedBy = "salle")
	private List<Classe> classes;
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(String designation, Batiment batiment) {
		super();
		this.designation = designation;
		this.batiment = batiment;
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

	public Batiment getBatiment() {
		return batiment;
	}

	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}

	public List<Classe> getClasses() {
		return classes;
	}

	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}
	
	
}
