package in.ashwanthkumar.gocd.github.validator;

import java.util.Map;

public interface FieldValidator {
    public void validate(Map<String, Object> fieldValidation);
}
