// Abstraction
interface MessageSender {
    send(message: string): void;
}

// Implémentation
class EmailSender implements MessageSender {
    send(message: string): void {
        console.log("Email:", message);
    }
}

// Consommateur
class NotificationService {
    constructor(private sender: MessageSender) {}

    notify(message: string) {
        this.sender.send(message);
    }
}