package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Professeur extends Personne implements Serializable{
	@Id
	private String matricule;
	private Long contact;
	@ManyToMany
	List<Matiere> matieres;

	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professeur(String nom, String prenom, String sexe, String matricule, Long contact) {
		super(nom, prenom, sexe);
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
	public List<Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}
	
	@Override
	public String toString() {
		return "Professeur [matricule=" + matricule + ", contact=" + contact + ", matieres=" + matieres + "]";
	}
	
	
	
	
	
}
