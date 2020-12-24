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
	public AnneeScolaire() {
		// TODO Auto-generated constructor stub
	}
	public AnneeScolaire(Long id, String designation, List<Trimestre> trimestre) {
		this.id = id;
		this.designation = designation;
		this.trimestres = trimestre;
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
	public List<Trimestre> getTrimestre() {
		return trimestres;
	}
	public void setTrimestre(List<Trimestre> trimestre) {
		this.trimestres = trimestre;
	}
	
	
	
}

