package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.example")

public class Main {

    @Bean
    public UserService getUserServiceBean(){
        return new UserService();
    }

    public static void main(String[] args) {
    ApplicationContext context =
            SpringApplication.run(Main.class, args);

    OrderService ordSrv = context.getBean(OrderService.class);
    ordSrv.placedOrder();

    }
}