package ocp.abstractclass;

public class EmailSender extends INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Envoyé par Email : " + message);
    }
}
