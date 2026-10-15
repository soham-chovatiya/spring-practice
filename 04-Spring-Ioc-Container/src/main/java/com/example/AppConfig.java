package com.example;

import com.example.Payment.CardPayment;
import com.example.Payment.PaymentService;
import com.example.Payment.UPIPay;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")

public class AppConfig {

    @Bean
   public User createUser(){
       return new User("Aditya", 22);
   }

   @Bean
   public PaymentService createPayment(){
        return new CardPayment();
   }

   @Bean
   @Qualifier
   public PaymentService upiPayment(){
        return new UPIPay();
    }

   @Bean
   public OrderService createOrder( @Qualifier("createPayment")PaymentService paymentService){

        // return new OrderService (paymentService); or

       // if i not use Constructor then

       /*

       PaymentService ps = createPayment();
       OrderService order = new OrderService();
        order.setPaymentService(ps);

        return order;

        */



        // if i add @Autowired

       return new OrderService(paymentService);
   }

}
