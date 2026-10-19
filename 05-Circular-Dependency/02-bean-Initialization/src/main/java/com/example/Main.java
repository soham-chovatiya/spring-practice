package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Eager Initialization it is default for lazy go PaymentService
public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = appContext.getBean(OrderService.class);  // For Lazy;
        PaymentService paymentService = appContext.getBean(PaymentService.class);  // For Lazy;

    }
}