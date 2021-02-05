package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
public class Batiment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Désinagtion ne peut être vide")
	@Size(min = 3,message = "La désignation du batiment doit être au moins sur 3 caractères")
	private String designation;
	
	@OneToMany(mappedBy = "batiment",fetch = FetchType.EAGER)
	private List<Salle> salles;
	
	public Batiment() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	
	@Override
	public String toString() {
		return "Batiment [id=" + id + ", designation=" + designation + ", salles=" + salles + ", getSalles()="
				+ getSalles() + ", getId()=" + getId() + ", getDesignation()=" + getDesignation() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
