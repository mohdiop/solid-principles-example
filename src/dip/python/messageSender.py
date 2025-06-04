# Pas d'interface formelle
class EmailSender:
    def send(self, message):
        print(f"Email envoyé : {message}")

class NotificationService:
    def __init__(self, sender):
        self.sender = sender

    def notify(self, message):
        self.sender.send(message)