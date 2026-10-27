package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext cnt = new ClassPathXmlApplicationContext("Bean.xml");

        /*

        OrderService ordSrv = (OrderService) cnt.getBean("orderService");
        ordSrv.placeOrder();

         */

        OrderService ordSrv =
                cnt.getBean("orderService", OrderService.class);  // for multiple id with same class package


//        OrderService ordSrv2 = cnt.getBean("orderService2", OrderService.class);  // for multiple id with same class package
//        ordSrv.placeOrder();
//
//        System.out.println(ordSrv == ordSrv2);

//        PaymentService pytSrv =
//                cnt.getBean("paymentService", PaymentService.class);
//
//        pytSrv.pay();

        ordSrv.placeOrder();




    }
}