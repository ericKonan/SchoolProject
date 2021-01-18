package ci.orbit.schoolproject.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Moyenne implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int coefficient;
	private float moyenneTrim;
	private float moyenneGen;
	
	public Moyenne() {
		// TODO Auto-generated constructor stub
	}
	public Moyenne(Long id, int coefficient, float moyenneTrim, float moyenneGen) {
		this.id = id;
		this.coefficient = coefficient;
		this.moyenneTrim = moyenneTrim;
		this.moyenneGen = moyenneGen;
	}                                                                                                                                                                                                                                                                                                                                                                                                          	                                                                                                                                                                                                                                                                                           
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getMoyenneTrim() {
		return moyenneTrim;
	}
	public void setMoyenneTrim(float moyenneTrim) {
		this.moyenneTrim = moyenneTrim;
	}
	public float getMoyenneGen() {
		return moyenneGen;
	}
	public void setMoyenneGen(float moyenneGen) {
		this.moyenneGen = moyenneGen;
	}
	
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	@Override
	public String toString() {
		return "Moyenne [id=" + id + ", coefficient=" + coefficient + ", moyenneTrim=" + moyenneTrim + ", moyenneGen="
				+ moyenneGen +  "]";
	}
	
	
	
}
