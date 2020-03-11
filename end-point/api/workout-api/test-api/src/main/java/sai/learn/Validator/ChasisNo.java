package sai.learn.Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.lang.annotation.*;

@NotEmpty
@Constraint(validatedBy = ChassisNoValidator.class)
@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ChasisNo {
    String message() default "Invalid Chassis No";
    String regex() default "^[a-zA-Z0-9]{0,22}$";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
