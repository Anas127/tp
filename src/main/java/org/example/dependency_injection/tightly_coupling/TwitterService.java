package org.example.dependency_injection.tightly_coupling;

public class TwitterService {
    public void sendMessage(String message) {
        System.out.println(this.getClass().getSimpleName() + ": " + message);
    }
}
