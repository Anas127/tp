package org.example.dependency_injection.annotationbasedconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("messageSender")
public class MessageSender {
    private MessageService messageService;
    private MessageService emailService;

    public MessageSender(@Qualifier("smsService") MessageService messageService) {
        System.out.println("Constructor-based dependency injection 1");
        this.messageService = messageService;
    }

    @Autowired
    public MessageSender(@Qualifier("smsService") MessageService messageService,
                         @Qualifier("emailService") MessageService emailService) {

        this.messageService = messageService;
        this.emailService = emailService;

        System.out.println("Constructor-based dependency injection 2");
    }

    public void sendMessage(String message) {
        this.messageService.sendMessage(message);
    }
}
