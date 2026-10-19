package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderService {

    OrderService(){
        System.out.println("OrderService Created / Constructor");
    }
}
