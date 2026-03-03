package org.example.annotationbasedconf;

import org.example.annotationbasedconf.beans.Bike;
import org.example.annotationbasedconf.beans.Car;
import org.example.annotationbasedconf.beans.Cycle;
import org.example.annotationbasedconf.beans.Traveler;
import org.example.annotationbasedconf.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = applicationcontext.getBean(Car.class);
        car.move();

        Bike bike = applicationcontext.getBean(Bike.class);
        bike.move();

        Cycle cycle = applicationcontext.getBean(Cycle.class);
        cycle.move();

        Traveler traveler = applicationcontext.getBean(Traveler.class);
        traveler.startJourney();
    }
}