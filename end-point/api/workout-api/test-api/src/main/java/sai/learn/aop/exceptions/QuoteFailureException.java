package sai.learn.aop.exceptions;

import lombok.NoArgsConstructor;
import sai.learn.aop.NotificationRequest;

import java.util.List;

@NoArgsConstructor
public class QuoteFailureException extends IntegrationException  {
    @Override
    public NotificationRequest getNotificationRequest() {
        return null;
    }

    public QuoteFailureException(String exception){
        super(exception);
    }

    public QuoteFailureException(String exception,String subject){
        super(exception,subject);
    }

    public void addException(String exception){
        this.exceptions.add(exception);
    }


}
