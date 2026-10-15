package com.example;

import com.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component



public class OrderService {

//    @Autowired
    private final PaymentService paymentService;    // field DI

    OrderService(@Qualifier("cardPayment") PaymentService paymentService){  // It is a recommended approach. Reason being that a constructor is created as soon as the object is created. It has been. So the formation of its object

        this.paymentService = paymentService;

    }

//    @Autowired
//
//    public void setPaymentService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }



    // setter Methods

    /*

    @Autowired
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

     */




    /*

    public PaymentService paymentService;

    OrderService(PaymentService paymentService){

        this.paymentService = paymentService;

    }

     */

    public void placeOrder(){

        paymentService.pay();

        System.out.println("Ordered Placed");
    }


}
