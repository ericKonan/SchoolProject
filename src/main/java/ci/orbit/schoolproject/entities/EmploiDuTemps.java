package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.time.LocalTime;

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
	private LocalTime heuredebut;
	private LocalTime heurefin;
	@ManyToOne
	private Classe classe;
	@ManyToOne
	private Matiere matiere;
	
	public EmploiDuTemps() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmploiDuTemps(String jour, LocalTime heuredebut, LocalTime heurefin, Classe classe, Matiere matiere) {
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
	public LocalTime getHeuredebut() {
		return heuredebut;
	}
	public void setHeuredebut(LocalTime heuredebut) {
		this.heuredebut = heuredebut;
	}
	public LocalTime getHeurefin() {
		return heurefin;
	}
	public void setHeurefin(LocalTime heurefin) {
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
