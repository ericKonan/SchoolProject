package ci.orbit.schoolproject.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ci.orbit.schoolproject.business.BatimentInterface;
import ci.orbit.schoolproject.entities.Batiment;
import ci.orbit.schoolproject.exception.BatHttpNotFoundException;
import ci.orbit.schoolproject.exception.ForbiddenException;

@RestController
public class BatimentRest {
	@Autowired
	BatimentInterface batimentInterface;
	
	@PostMapping(path="/batiment")
	public Batiment createBatiment(@RequestBody @Valid Batiment batiment) {
		return batimentInterface.createBatiment(batiment);
	}
	
	@PutMapping("batiments/{id}")
	public Batiment updateBatiment(@RequestBody @Valid Batiment batiment, @PathVariable(name = "id") Long id) {
		return batimentInterface.updateBatiment(batiment, id);
		
	}
	
	@GetMapping("batiments/{id}")
	public Batiment getBatimentById(@PathVariable(name = "id") Long id) {
		Batiment batiment = batimentInterface.getBatimentById(id);
		 if (batiment == null) throw new BatHttpNotFoundException();
		 return batiment;
	}
		
	@GetMapping("batiments/list")
	public List<Batiment> getAllBatiments() {
		return batimentInterface.getAllBatiments();
	}
	
	@DeleteMapping("batiments/{id}")
	public void deleteBatiment(@PathVariable(name = "id") Long id) {
		batimentInterface.deleteBatiment(id);
	}
	
	@GetMapping("/exception")
	@ResponseBody
	public ResponseEntity<?> sendViaException() {
	    throw new ForbiddenException();
	}


		
}
