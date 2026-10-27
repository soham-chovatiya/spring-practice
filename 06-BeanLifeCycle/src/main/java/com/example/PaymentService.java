package com.example;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public static void pay(){
        System.out.println("Payment done");
    }

}
