package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AnneeScolaire implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	@OneToMany(mappedBy="anneeScolaire")
	private List<Trimestre> trimestres;
	@OneToMany(mappedBy="anneeScolaire")
	private List<Inscription> inscriptions;
	public AnneeScolaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnneeScolaire(String designation) {
		super();
		this.designation = designation;
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
	public List<Trimestre> getTrimestres() {
		return trimestres;
	}
	public void setTrimestres(List<Trimestre> trimestres) {
		this.trimestres = trimestres;
	}
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	
	
}

