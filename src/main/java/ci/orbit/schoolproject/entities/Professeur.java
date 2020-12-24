package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Professeur extends Personne implements Serializable{
	@Id
	private String matricule;
	private Long contact;
	@ManyToMany
	Set<Matiere> matieres;
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professeur(String nom, String prenom, String sexe, String matricule, Long contact, Set<Matiere> matieres) {
		super(nom, prenom, sexe);
		this.matricule = matricule;
		this.contact = contact;
		this.matieres = matieres;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public Set<Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(Set<Matiere> matieres) {
		this.matieres = matieres;
	}
	
	
	
}
