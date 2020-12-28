package ci.orbit.schoolproject.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.entities.Cours;
import ci.orbit.schoolproject.entities.Evaluation;
import ci.orbit.schoolproject.entities.Professeur;
@Service
@Transactional
public class ProfesseurHandler implements ProfesseurInterface{

	@Override
	public Professeur createProfesseur(String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professeur updateProfesseur(Long id, String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProfesseur(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cours> listCoursByProfesseur(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evaluation> listEvaluationByProfesseur(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
