package sai.learn.aop.exceptions;

import sai.learn.aop.NotificationRequest;

public class ProposalFailureException extends IntegrationException{
    @Override
    public NotificationRequest getNotificationRequest() {
        return null;
    }
}
