package sai.learn.aop.exceptions;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sai.learn.aop.NotificationRequest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
public abstract class IntegrationException extends Exception implements MailSupport{

    protected Map<String,String> notificationContent=new LinkedHashMap();

    protected List<String> exceptions=new ArrayList<>();

    protected String subject;

    public IntegrationException(String exception){
        super(exception);
        this.exceptions.add(exception);
    }

    public IntegrationException(String exception,String subject){
        super(exception);
        this.exceptions.add(exception);
        this.subject=subject;
    }


    public abstract NotificationRequest getNotificationRequest();

    @Override
    public String getTo() {
        return null;
    }
}
