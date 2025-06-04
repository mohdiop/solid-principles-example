abstract class MessageSender {
  void send(String message);
}

class EmailSender implements MessageSender {
  void send(String message) {
    print("Email envoyé : $message");
  }
}

class NotificationService {
  final MessageSender sender;

  NotificationService(this.sender);

  void notify(String message) {
    sender.send(message);
  }
}
