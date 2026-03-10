package org.example.dependency_injection.loose_coupling;

public class TwitterService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println(this.getClass().getSimpleName() + ": " + message);
    }

}
