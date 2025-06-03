package ocp.abstractclass;

public class SmsSender extends INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Envoyé par SMS : " + message);
    }
}
