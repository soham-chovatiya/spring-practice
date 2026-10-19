package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") //Eager initialization
@Scope("singleton")  // lazy initialization
public class OrderService {

    OrderService(){
        System.out.println("OrderService Created / Constructor");
    }

    public void placeOrder(){
        System.out.println("Order Placed");
    }

}
