package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Salle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 3,message = "La désignation du batiment doit être au moins sur 3 caractères")
	@NotEmpty(message = "Désinagtion ne peut être nulle")
	private String designation;
	@ManyToOne
	@NotNull(message = "Batiment ne peut être nulle")
	@JsonIgnore
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

	@Override
	public String toString() {
		return "Salle [id=" + id + ", designation=" + designation + ", batiment=" + batiment + ", classes=" + classes
				+ ", getId()=" + getId() + ", getDesignation()=" + getDesignation() + ", getBatiment()=" + getBatiment()
				+ ", getClasses()=" + getClasses() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
