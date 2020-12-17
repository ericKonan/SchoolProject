package ci.orbit.schoolproject.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Eleve extends Personne implements Serializable{
	private Long identifiant;
	private Date  dateNaissance;
	
	
	
	public Eleve(Long id, String nom, String prenom, char sexe, Long identifiant, Date dateNaissance) {
		super(id, nom, prenom, sexe);
		this.identifiant = identifiant;
		this.dateNaissance = dateNaissance;
	}

	public Long getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
}
