package sai.learn.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;

public class RequestValidator implements ConstraintValidator<ValidateRequest,Request> {

//    Class ref;
//
//    @Override
//    public void initialize(ValidateRequest constraintAnnotation) {
//        ref=constraintAnnotation.className();
//    }

    @Override
    public boolean isValid(Request request, ConstraintValidatorContext constraintValidatorContext) {

        if(request.isValidateDate()){
            return request.getPolicyExpiryDate().before(new Date());
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Date().getTime());
    }
}
