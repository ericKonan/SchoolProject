package ci.orbit.schoolproject.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ci.orbit.schoolproject.entities.Batiment;

public class BatimentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Batiment.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "designation", "designation.empty");
		Batiment b = (Batiment) target;
        if (b.getDesignation().length() <= 2) {
            e.rejectValue("designation", "shortvalue");
        } 

	}

}
