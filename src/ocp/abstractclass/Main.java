package ocp.abstractclass;

public class Main {
    public static void main(String[] args) {
        NotificationSender notificationSender = new NotificationSender(new SmsSender());
        notificationSender.sendNotification("Bonjour");

        notificationSender.setiNotificationSender(new EmailSender());
        notificationSender.sendNotification("Bonjour");
    }
}
