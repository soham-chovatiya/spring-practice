package com.example;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class CartService implements BeanNameAware, ApplicationContextAware /*, DisposableBean, implements InitializingBean */ {

    Map<Integer, String> map;

    public CartService(){

        map = new HashMap<>();
        System.out.println("CartService Constructor Called");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is: " + applicationContext.getClass());
    }

    @PostConstruct
    public void start2(){

        System.out.println("Bean is Ready");
        map.put(1, "Aditya");
        map.put(2, "Rohit");

    }


    public void start(){    // we can write also
        System.out.println("Bean is Ready");
        map.put(1, "Aditya");
        map.put(2, "Rohit");
    }

    public void addToCart(){

        System.out.println("Added to Cart");

    }

    public String getValue(int key){

        return map.get(key);

    }

    @PreDestroy
    public void stop(){    // we can write also

        map.clear();
        System.out.println("Bean is getting Destroyed");

    }

//    public void stop(){    // we can write also
//        map.clear();
//        System.out.println("Bean is getting Destroyed");
//    }

//    @Override
//    public void destroy() throws Exception {
//        map.clear();
//        System.out.println("Bean is getting Destroyed");
//
//    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean is Ready");
//        map.put(1, "Aditya");
//        map.put(2, "Rohit");
//    }

}
