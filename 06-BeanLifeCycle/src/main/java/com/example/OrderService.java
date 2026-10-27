package com.example;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;

    }

    public void placeOrder(){

        System.out.println("Order Placed");

        PaymentService.pay();

    }

}
