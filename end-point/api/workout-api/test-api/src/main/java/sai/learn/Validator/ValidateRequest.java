package sai.learn.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = RequestValidator.class)
public @interface ValidateRequest {
    String message() default "Policy Expiry Date is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
