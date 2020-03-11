package sai.learn.Validator;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "sai.learn.validator",ignoreInvalidFields = true)
public class ValidationConfig {
    public static final String VALIDATE = "validate";
    public static final String VALUE = "value";
    public static final String MESSAGE="message";

    public static final String CHASSIS="chasis";
    public static final String CHASSIS_REGEX="regex";

    private Map<String, Map<String, Map<String, Object>>> motor = new HashMap<>();

    private Map<String, Map<String, Map<String, Object>>> tw = new HashMap<>();

    @PostConstruct
    public void showConfig(){
        System.out.println(this);
    }

}
