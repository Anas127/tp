package org.example.dependency_injection.loose_coupling;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws FileNotFoundException,
            ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException {

        Scanner scanner = new Scanner(new File("config.txt"));

        // Read MessageService class name
        String messageServiceClassName = scanner.nextLine();
        Class<?> messageServiceClass = Class.forName(messageServiceClassName);

        // Create instance of MessageService
        Object messageServiceInstance =
                messageServiceClass.getDeclaredConstructor().newInstance();

        // Read MessageSender class name
        String messageSenderClassName = scanner.nextLine();
        Class<?> messageSenderClass = Class.forName(messageSenderClassName);

        // Create MessageSender instance using constructor injection
        Constructor<?> constructor =
                messageSenderClass.getConstructor(MessageService.class);

        Object messageSenderInstance =
                constructor.newInstance(messageServiceInstance);

        // Invoke sendMessage method
        messageSenderClass
                .getMethod("sendMessage", String.class)
                .invoke(messageSenderInstance, "Hi! I have a message for you");
    }
}
