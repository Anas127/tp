package org.example.adding_new_beans_programmatically.main;

import org.example.adding_new_beans_programmatically.beans.Vehicle;
import org.example.adding_new_beans_programmatically.config.AppConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        try {
            Vehicle veh1 = context.getBean(Vehicle.class);
            veh1.printHello();
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("No vehicle found");
        }

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        if (randomNumber % 2 == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("No volkswagen Vehicle");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("No audi Vehicle");
        }

        if (null != volksVehicle) {
            System.out.println("Programming Vehicle name from Spring Context is: "
                    + volksVehicle.getName());
        }

        if (null != audiVehicle) {
            System.out.println("Programming Vehicle name from Spring Context is: "
                    + audiVehicle.getName());
        }
    }
    }

