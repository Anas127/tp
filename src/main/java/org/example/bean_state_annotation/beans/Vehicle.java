package org.example.bean_state_annotation.beans;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello I'm Vehicle bean and my name is " + name);
    }

    @PostConstruct
    public void initialize() {
        this.name = "Toyota Yaris";
        System.out.println("@PostConstruct : initialize method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@PreDestroy method : destroy method : Destroying Vehicle Bean");
    }
}
