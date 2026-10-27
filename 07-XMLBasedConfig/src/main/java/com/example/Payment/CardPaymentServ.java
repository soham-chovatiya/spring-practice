package com.example.Payment;

public class CardPaymentServ implements PService{
    @Override
    public void pay(){
        System.out.println("Paying via Card");
    }
}
