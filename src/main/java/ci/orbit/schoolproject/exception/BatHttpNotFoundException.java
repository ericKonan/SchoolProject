package ci.orbit.schoolproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Batiment")
public class BatHttpNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BatHttpNotFoundException() {
		// TODO Auto-generated constructor stub
	}

}
