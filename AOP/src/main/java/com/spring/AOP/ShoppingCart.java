package com.spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){
        // Before writing the business logic, the below cross cutting concerns are written
        // Logging
        // Authentication
        // Authorization
        // Santization
        System.out.println("Checkout method called in shopping cart");
    }

    public int quantity(){
        return 12;
    }

}
