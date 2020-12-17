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
	
	private String matricule;
	private Long contact;
	@ManyToMany
	Set<Matiere> matieres;
	
	
	public Professeur(Long id, String nom, String prenom, char sexe, String matricule, Long contact) {
		super(id, nom, prenom, sexe);
		this.matricule = matricule;
		this.contact = contact;
		
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
	
	
}
