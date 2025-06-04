# Pas d'interface formelle

from typing import Protocol

class MessageSender(Protocol):
    def send(self, message: str) -> None: ...

class EmailSender:
    def __init__(self):
        pass

    def send(self, message):
        print("Email:", message)

class NotificationService:
    def __init__(self, sender):
        self.sender = sender

    def notify(self, message):
        self.sender.send(message)

service = NotificationService(EmailSender())