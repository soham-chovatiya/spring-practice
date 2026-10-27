package com.example;


import com.example.Payment.PService;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final PService pSer;

    OrderService(PService pSer){

        this.pSer = pSer;

    }

//    private  PaymentService paymentSrv;
//
//    public OrderService(PaymentService paymentSrv){
//
//        this.paymentSrv = paymentSrv;
//        // System.out.println("orderService Created");
//    }

    public void placeOrder(){
        pSer.pay();
        System.out.println("Order Placed");
    }

//    public void  setPaymentService(PaymentService paymentSrv){
//        this.paymentSrv = paymentSrv;
//    }

//    @Bean
//    public OrderService getOrderService(){
//        return new OrderService(paymentSrv);
//    }
}
