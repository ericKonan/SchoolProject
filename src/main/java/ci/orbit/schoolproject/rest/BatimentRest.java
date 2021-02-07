package ci.orbit.schoolproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ci.orbit.schoolproject.business.BatimentInterface;
import ci.orbit.schoolproject.entities.Batiment;

@RestController
public class BatimentRest {
	@Autowired
	BatimentInterface batimentInterface;
	
	@GetMapping("batiments/{id}")
	public Batiment getBatimentById(@PathVariable(name = "id") Long id) {
		return batimentInterface.getBatimentById(id);
	}
	
	@GetMapping("batiments/list")
	public List<Batiment> getAllBatiments() {
		return batimentInterface.getAllBatiments();
	}
		
}
