package ci.orbit.schoolproject.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Eleve extends Personne implements Serializable{
	private Long identifiant;

}
