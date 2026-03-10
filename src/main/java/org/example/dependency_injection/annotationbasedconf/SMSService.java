package org.example.dependency_injection.annotationbasedconf;


import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println(this.getClass().getSimpleName() + ": " + message);
    }
}
