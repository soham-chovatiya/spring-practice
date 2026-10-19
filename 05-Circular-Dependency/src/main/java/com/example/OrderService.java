package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private  PaymentService paymentService;

//    OrderService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){

        paymentService.pay();

        getOrderDetails();
        System.out.println("Order Placed");
    }

    // solve the circular Dependency
    public void getOrderDetails(){
        System.out.println("Order Details");
    }

}
