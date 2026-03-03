package org.example.annotationbasedconf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =
"org.example.annotationbasedconf.beans")
public class AppConfig {
}
