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
	private float moyenneTrim;
	private float moyenneGen;
	@ManyToOne
	private Trimestre trimestre;
	public Moyenne() {
		// TODO Auto-generated constructor stub
	}
	public Moyenne(Long id, float moyenneTrim, float moyenneGen, Trimestre trimestre) {
		this.id = id;
		this.moyenneTrim = moyenneTrim;
		this.moyenneGen = moyenneGen;
		this.trimestre = trimestre;
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
	public Trimestre getTrimestre() {
		return trimestre;
	}
	public void setTrimestre(Trimestre trimestre) {
		this.trimestre = trimestre;
	}
	
	
	
}
