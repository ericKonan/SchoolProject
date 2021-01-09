package ci.orbit.schoolproject.entities;



import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Activite {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private Date date;
	private Time heuredebut;
	private Time heurefin;
	@ManyToOne
	private Professeur professeur;
	@ManyToOne
	private Classe classe;
	@ManyToOne
	private Matiere matiere;
	@ManyToOne
	private Trimestre trimestre;
	
	
	public Activite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Activite(Date date, Time heuredebut, Time heurefin, Professeur professeur,
			Classe classe, Matiere matiere, Trimestre trimestre) {
		super();
		this.date = date;
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
		this.professeur = professeur;
		this.classe = classe;
		this.matiere = matiere;
		this.trimestre = trimestre;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public Professeur getProfesseur() {
		return professeur;
	}
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
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
	public Trimestre getTrimestre() {
		return trimestre;
	}
	public void setTrimestre(Trimestre trimestre) {
		this.trimestre = trimestre;
	}
	
}
