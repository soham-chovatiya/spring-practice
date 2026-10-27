package com.example.Payment;

public class UPIPayment implements PService {

    @Override
        public void pay(){
           System.out.println("Paying via upi");
        }
}
