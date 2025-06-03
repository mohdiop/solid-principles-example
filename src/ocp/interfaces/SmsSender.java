package ocp.interfaces;

public class SmsSender implements INotificationSender{
    @Override
    public void send(String message) {
        System.out.println("Envoyé par SMS : " + message);
    }
}
