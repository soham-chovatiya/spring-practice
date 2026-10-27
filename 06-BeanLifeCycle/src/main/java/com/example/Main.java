package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();
//        orderService.placeOrder();

//        AppConfig a = context.getBean(AppConfig.class);
//        AppConfig b = context.getBean(AppConfig.class);
//
//        System.out.println(a == b);

//        UserService userservice = context.getBean(UserService.class);
//        userservice.setBeanName("userBean3");


        CartService crt = context.getBean(CartService.class);
        System.out.println(crt.getValue(1));

        context.close();

    }
}