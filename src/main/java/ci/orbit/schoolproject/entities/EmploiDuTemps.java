package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EmploiDuTemps implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String jour;
	private Time heuredebut;
	private Time heurefin;
	@ManyToOne
	private Classe classe;
	@ManyToOne
	private Matiere matiere;
	public EmploiDuTemps(Long id, String jour, Time heuredebut, Time heurefin, Classe classe, Matiere matiere) {
		this.id = id;
		this.jour = jour;
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
		this.classe = classe;
		this.matiere = matiere;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public Time getHeuredebut() {
		return heuredebut;
	}
	public void setHeuredebut(Time heuredebut) {
		this.heuredebut = heuredebut;
	}
	public Time getHeurefin() {
		return heurefin;
	}
	public void setHeurefin(Time heurefin) {
		this.heurefin = heurefin;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	
	
	
}
