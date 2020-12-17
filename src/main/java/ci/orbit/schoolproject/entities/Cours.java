package ci.orbit.schoolproject.entities;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cours implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private LocalDate date;
	private LocalTime heuredebut;
	private LocalTime heurefin;
	@ManyToOne
	private Professeur professeur;
	@ManyToOne
	private Classe classe;
	@ManyToOne
	private Matiere matiere;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
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
	
}