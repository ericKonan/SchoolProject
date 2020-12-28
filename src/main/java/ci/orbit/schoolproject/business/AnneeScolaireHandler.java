package ci.orbit.schoolproject.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.entities.AnneeScolaire;
import ci.orbit.schoolproject.entities.Eleve;
@Service
@Transactional
public class AnneeScolaireHandler implements AnneeSoclaireInterface{

	@Override
	public AnneeScolaire createAnneeScolaire(String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnneeScolaire updateAnneeScolaire(Long id, String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAnneeScolaire(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Eleve> listEleveByAnnescolaire(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
