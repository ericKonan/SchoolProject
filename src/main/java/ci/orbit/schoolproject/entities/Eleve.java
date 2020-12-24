package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Eleve extends Personne implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identifiant;
	private Date  dateNaissance;
	@OneToMany(mappedBy="eleve")
	private List<Note> notes;
	public Eleve() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Eleve(String nom, String prenom, String sexe, int identifiant, Date dateNaissance, List<Note> notes) {
		super(nom, prenom, sexe);
		this.identifiant = identifiant;
		this.dateNaissance = dateNaissance;
		this.notes = notes;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	
}
