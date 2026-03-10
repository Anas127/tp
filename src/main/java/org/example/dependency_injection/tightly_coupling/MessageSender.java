package org.example.dependency_injection.tightly_coupling;

public class MessageSender {
    //private SMSService smsService;
    //private EmailService emailService;
    private TwitterService twitterService;


    //public MessageSender(SMSService smsService) {
    //    this.smsService = smsService;
    //}

    //public MessageSender(EmailService emailService) {
    //    this.emailService = emailService;
    //}

    public MessageSender(TwitterService twitterService) {
        this.twitterService = twitterService;
    }

    public void sendMessage(String message) {
        //this.smsService.sendMessage(message);
        //this.emailService.sendMessage(message);
        this.twitterService.sendMessage(message);
    }
}
