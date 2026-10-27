package com.example;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@ComponentScan("com.example")

@Configuration
@Scope("singleton")
public class AppConfig {

    public  AppConfig(){

        System.out.println("Start Application");

    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public CartService getBean(){
//
//        return new CartService();
//
//    }

}
