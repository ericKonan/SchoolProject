package ci.orbit.schoolproject.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ci.orbit.schoolproject.business.SalleInterface;
import ci.orbit.schoolproject.entities.Salle;

public class SalleRest {
	
	@Autowired
	SalleInterface salleInterface;
	
	@PostMapping(path="/salle")
	public Salle createSalle(@RequestBody @Valid Salle salle) {
		return salleInterface.createSalle(salle);
	}
	
	@PutMapping("salles/{id}")
	public Salle updateSAlle(@RequestBody @Valid Salle salle, @PathVariable(name = "id") Long id) {
		return salleInterface.updateSAlle(salle, id);
	}
	
	@GetMapping("salles/{id}")
	public Salle getSalleById(Long id) {
		return salleInterface.getSalleById(id);
	}
	
	@GetMapping("salles/")
	public List<Salle> getAllSalle() {
		return salleInterface.getAllSalle();
	}
	
	@DeleteMapping("salles/{id}")
	public void deleteSalle(@PathVariable(name = "id") Long id) {
		salleInterface.deleteSalle(id);
	}

}
