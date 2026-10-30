package com.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner /*ApplicationRunner*/ {

    private  final PymentGateway paymentGateway;

    DemoRunner(PymentGateway paymentGateway){
        this.paymentGateway =paymentGateway;
    }

    @Override
    public void run(String... args) throws Exception {
        paymentGateway.print();}

    /*

    @Override
    public void run(ApplicationArguments args) throws Exception{
        paymentGateway.print();
    }

     */
}
