package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Professeur extends Personne implements Serializable{
	private String matricule;
	private Long contact;
	@ManyToMany
	@JoinTable(
		name = "prof_matiere",
		joinColumns = @JoinColumn(name="professeur_id"),
		inverseJoinColumns = @JoinColumn(name="matiere_id"))
	Set<Matiere> matieres;
	
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
