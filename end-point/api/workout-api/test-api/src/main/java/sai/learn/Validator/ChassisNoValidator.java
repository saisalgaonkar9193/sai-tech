package sai.learn.Validator;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;

public class ChassisNoValidator implements ConstraintValidator<ChasisNo, String> {

    @Autowired
    private ValidationConfig validationConfig;

    @Autowired
    private BiPredicate<String, String> chasisRegex;

    private String regex;

    @Override
    public void initialize(ChasisNo constraintAnnotation) {
        this.regex = constraintAnnotation.regex();
    }

    @Override
    public boolean isValid(String chasisNo, ConstraintValidatorContext constraintValidatorContext) {


        Map<String, Map<String, Object>> chasisValidation = validationConfig.getMotor().getOrDefault(ValidationConfig.CHASSIS, new HashMap<>());

        Map<String, Object> regexValidation = chasisValidation.getOrDefault(ValidationConfig.CHASSIS_REGEX, new HashMap<>());

        if ((boolean) regexValidation.getOrDefault(ValidationConfig.VALIDATE, false)) {
            Optional.ofNullable(regexValidation.get(ValidationConfig.MESSAGE))
                    .ifPresent(message -> {
                        constraintValidatorContext.disableDefaultConstraintViolation();
                        constraintValidatorContext.buildConstraintViolationWithTemplate(message.toString()).addConstraintViolation();
                    });
            return chasisRegex.test(chasisNo, regexValidation.getOrDefault(ValidationConfig.VALUE, this.regex).toString());
        }


        return true;
    }


}
