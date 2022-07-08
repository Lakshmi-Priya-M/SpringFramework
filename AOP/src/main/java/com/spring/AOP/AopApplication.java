package com.spring.AOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
		shoppingCart.checkout("NORMAL");
		int quantity = shoppingCart.quantity();
		System.out.println(quantity);
	}
}

