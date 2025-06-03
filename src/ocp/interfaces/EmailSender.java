package ocp.interfaces;

public class EmailSender implements INotificationSender{
    @Override
    public void send(String message) {
        System.out.println("Envoyé par Email : " + message);
    }
}
