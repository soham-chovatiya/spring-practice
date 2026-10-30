package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// mostly used  while we are working with Application Properties

@Component
public class PymentGateway {

    private PaymentProperties paymentProperties;

    PymentGateway( PaymentProperties paymentProperties){

        this.paymentProperties = paymentProperties;

    }

    public void print(){

        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnable());
        System.out.println(getTimeOut());

    }

    public boolean isEnable() {
        return paymentProperties.isEnable();
    }

    public int getTimeOut() {
        return paymentProperties.getTimeOut();
    }

    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }

    public String getType() {
        return paymentProperties.getType();
    }



//    @Value("${PymentGateway.type: Rozarpay}"  /* defaul value */)
//    private String type;
//
//    @Value("${rePymentGateway.tryCount: 3}"  /* defaul value */)
//    private int retryCount;



    /*

    public PymentGateway(@Value("${PymentGateway.type}")String type,
                         @Value("${rePymentGateway.tryCount}")int retryCount) {
        this.type = type;
        this.retryCount = retryCount;
    }

     */



    /*

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getRetryCount() {
        return retryCount;
    }

     */

}
