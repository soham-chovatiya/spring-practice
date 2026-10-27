package com.example;

import com.example.Payment.CardPayment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class Main {
    public static void main(String[] args) {

          ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
            OrderService orderService = context.getBean(OrderService.class);
            orderService.placeOrder();
//         User user = context.getBean(User.class);
//         System.out.println(user.getName() + " " + user.getAge());



    }
}