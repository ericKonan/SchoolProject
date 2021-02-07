package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Inscription implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	@Size(max = 8,message = "La désignation du batiment doit être au moins sur 3 caractères")
	private Date date ;
	@NotEmpty(message = "Classe ne peut être vide")
	@ManyToOne
	private Classe classe;
	@NotEmpty(message = "Eleve ne peut être vide")
	@ManyToOne
	private Eleve eleve;
	@NotEmpty(message = "Classe ne peut être vide")
	@ManyToOne
	private AnneeScolaire anneeScolaire;
	
	public Inscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Inscription(Date date, Classe classe, Eleve eleve, AnneeScolaire anneeScolaire) {
		super();
		this.date = date;
		this.classe = classe;
		this.eleve = eleve;
		this.anneeScolaire = anneeScolaire;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}
	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}


	@Override
	public String toString() {
		return "Inscription [id=" + id + ", date=" + date + ", classe=" + classe + ", eleve=" + eleve
				+ ", anneeScolaire=" + anneeScolaire + "]";
	}
	
	
	
}
