package sai.learn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EntityNotCreated extends RuntimeException {

    public EntityNotCreated(String message) {
        super(message);
    }
}
