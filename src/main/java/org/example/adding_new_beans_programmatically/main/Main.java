package org.example.adding_new_beans_programmatically.main;

import org.example.adding_new_beans_programmatically.beans.Parrot;
import org.example.adding_new_beans_programmatically.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Parrot parrot = new Parrot();
        parrot.setName("Koko");

        Supplier<Parrot> parrotSupplier = () -> parrot;

        context.registerBean("parrot1", Parrot.class, parrotSupplier);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
