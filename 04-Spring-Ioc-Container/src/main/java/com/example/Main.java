package com.example;

public class Main {
    public static void main(String[] args) {

            OrderService orderService = new OrderService();
            orderService.placeOrder();

            PaymentService paymentService = new PaymentService();
            paymentService.pay();

    }
}