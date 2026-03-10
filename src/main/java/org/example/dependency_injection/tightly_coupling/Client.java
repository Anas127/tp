package org.example.dependency_injection.tightly_coupling;

public class Client {
    public static void main(String[] args) {
        String message = "Hi! I have a message for you";

        //SMSService smsService = new SMSService();
        //EmailService emailService = new EmailService();
        TwitterService twitterService = new TwitterService();

        //MessageSender messageSender = new MessageSender(smsService);
        //MessageSender messageSender = new MessageSender(emailService);
        MessageSender messageSender = new MessageSender(twitterService);

        messageSender.sendMessage(message);
    }
}
