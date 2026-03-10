package org.example.dependency_injection.loose_coupling;

public class Client {
    public static void main(String[] args) {
        String message = "Hi! I have a message for you";

        //Instanciation statique avec l’opérateur new
        //MessageService messageService = new SMSService();
        //MessageService messageService = new EmailService();
        MessageService messageService = new TwitterService();

        MessageSender messageSender = new MessageSender(messageService);

        messageSender.sendMessage(message);
    }
}
