package ci.orbit.schoolproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ci.orbit.schoolproject.dao.ClasseRepository;
import ci.orbit.schoolproject.dao.SalleRepository;
import ci.orbit.schoolproject.entities.Classe;
import ci.orbit.schoolproject.entities.Salle;

@Service
@Transactional
public class AffectationServiceImp implements IAffectationService{
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private ClasseRepository classeRepository;

	@Override
	public void affecterClasse(Long idClasse, Salle salle) {
		Classe cl  = classeRepository.findById(idClasse).get();
		cl.setSalle(salle);
		
		
	}

}
