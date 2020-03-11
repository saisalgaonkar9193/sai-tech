package sai.learn.Validator;

import lombok.Data;

import javax.validation.Valid;
import java.util.Date;

@Data
@ValidateRequest
public class Request {
    private String textLength;

    private String type;

    @Valid
    private InnerClass inc;

    private boolean validateDate;

    private Date policyExpiryDate;
}
