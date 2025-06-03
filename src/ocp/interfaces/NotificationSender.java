package ocp.interfaces;

public class NotificationSender {
    private INotificationSender iNotificationSender;

    public NotificationSender(INotificationSender iNotificationSender){
        this.iNotificationSender = iNotificationSender;
    }

    public void setiNotificationSender(INotificationSender iNotificationSender) {
        this.iNotificationSender = iNotificationSender;
    }

    public void sendNotification(String message){
        iNotificationSender.send(message);
    }
}

