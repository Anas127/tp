package org.example.dependency_injection.annotationbasedconf;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.dependency_injection.annotationbasedconf")
public class AppConfig {
}
