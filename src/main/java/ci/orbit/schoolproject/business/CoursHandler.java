package ci.orbit.schoolproject.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ci.orbit.schoolproject.dao.CoursRepository;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Cours;
import ci.orbit.schoolproject.entities.Matiere;
import ci.orbit.schoolproject.entities.Professeur;
import ci.orbit.schoolproject.entities.Trimestre;
import ci.orbit.schoolproject.exception.NotFoundException;

public class CoursHandler implements CoursInterface {
	@Autowired
	CoursRepository coursRepository;

	@Override
	public Cours createCours(Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere, Trimestre trimestre, String type_evaluation) {
		 Cours crs = coursRepository.save(new Cours(date, heuredebut, heurefin, professeur, classe, matiere, trimestre, type_evaluation));
		return crs;
	}

	@Override
	public Cours readCours(Long id) throws NotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cours updateCours(Long id, Date date, Time heuredebut, Time heurefin, Professeur professeur, Classe classe,
			Matiere matiere,  Trimestre trimestre, String observation) {
		 Cours crs = coursRepository.findById(id).get();
		 crs.setDate(date);
		 crs.setHeuredebut(heuredebut);
		 crs.setHeurefin(heurefin);
		 crs.setMatiere(matiere);
		 crs.setProfesseur(professeur);
		 crs.setTrimestre(trimestre);
		 crs.setObservation(observation);
		 return crs;
	}

	@Override
	public void deleteCours(Long id) {
		coursRepository.deleteById(id);

	}

	@Override
	public List<Cours> listCoursByProfesseur(Professeur professeur) {
		List<Cours> crs = coursRepository.findByProfesseur(professeur);
		return crs;
	}

	@Override
	public List<Cours> listCoursByClasse(Classe classe) {
		List<Cours> crs = coursRepository.findByClasse(classe);
		return crs;
	}

}
