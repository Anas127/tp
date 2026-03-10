package org.example.dependency_injection.annotationbasedconf;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println(this.getClass().getSimpleName() + ": " + message);
    }
}
