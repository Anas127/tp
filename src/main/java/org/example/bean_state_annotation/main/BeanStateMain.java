package org.example.bean_state_annotation.main;

import org.example.bean_state_annotation.beans.Vehicle;
import org.example.bean_state_annotation.config.BeanStateConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanStateMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanStateConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Component Vehicle name from spring context is: "
                + vehicle.getName());

        vehicle.printHello();

        ((AnnotationConfigApplicationContext) context).close();
    }
}
