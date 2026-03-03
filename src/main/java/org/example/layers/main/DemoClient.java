package org.example.layers.main;

import org.example.layers.config.AppConfig;
import org.example.layers.controller.DemoController;
import org.example.layers.repository.DemoRepositry;
import org.example.layers.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoController demoController = applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());
        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService.hello());
        DemoRepositry demoRepositry = applicationContext.getBean(DemoRepositry.class);
        System.out.println(demoRepositry.hello());

        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
