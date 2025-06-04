package ocp.interfaces;

public class NotificationSender {
    private INotificationSender iNotificationSender;

    // Injection de la dépendance manuelle par constructeur
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

