package com.example;

public class PaymentService {

    private String type;
    private int retryCount;

     public PaymentService( String type, int retryCount){
        this.type = type;
        this.retryCount = retryCount;
    }

    public void pay(){

        System.out.println("PaymentService done. Type of Payment is: "
                + type + " with "
                + retryCount + " Counts ");


    }
}
