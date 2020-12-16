package ci.orbit.schoolproject.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Professeur extends Personne implements Serializable{
	private String matricule;
	private Long contact;
}
