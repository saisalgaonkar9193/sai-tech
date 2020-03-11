package sai.learn.Validator;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ValidatorHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        System.out.println("handleValidationExceptions");
        String str=null;
        List<String> errors = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            getErrorMessage(error);
//            System.out.println(error.getClass()+"--->"+(error instanceof ObjectError));
//            String fieldName = ((FieldError) error).getField();
//            str.length();
            String errorMessage = error.getDefaultMessage();
            errors.add(errorMessage);
        });
        return errors;
//        return new HashMap<>();
    }

    private String getErrorMessage(ObjectError error) {
        if (error instanceof ObjectError) {
            ObjectError object = (ObjectError) error;
        } else if (error instanceof FieldError) {

        }
        return  null;
    }
}
