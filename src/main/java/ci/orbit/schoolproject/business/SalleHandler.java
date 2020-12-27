package ci.orbit.schoolproject.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.SalleRepository;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Salle;

@Service
@Transactional
public class SalleHandler implements SalleInterface{
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private ClasseRepository classeRepository;

	@Override
	public void setClasseAffectation(Long idClasse, Salle salle) {
		Classe cl  = classeRepository.findById(idClasse).get();
		cl.setSalle(salle);
		
		
	}

	@Override
	public Salle createSalle(String designation, Batiment batiment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salle updateSAlle(Long id, String designation, Batiment batiment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSalle(Long id) {
		// TODO Auto-generated method stub
		
	}

}
