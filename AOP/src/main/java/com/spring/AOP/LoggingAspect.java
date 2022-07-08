package com.spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component // Spring only understands a bean, so this class is annotated with @Component
public class LoggingAspect {

    // The below method is called as pointcut. So this method can be invoked before a checkout method is called.
    @Before("execution(* com.spring.AOP.ShoppingCart.checkout(..))")
    public void beforelogger(JoinPoint jp){
        System.out.println("Method Signature " + jp.getSignature());
        System.out.println("Input Parameter " + jp.getArgs()[0].toString());
        System.out.println("Before Logger");
    }

    // execution(any-return-type from-any-package and it's class name containing checkout method, the below method will be called.
    @After("execution(* *.checkout(..))")
    public void afterlogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(* *.quantity())")
    public void afterReturningPointCut(){
     // After the quantity method has returned a value, the point method afterReturning should be called.
        //But here it actually not works :/ :(. // TO DO
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning : " + retVal);
    }
}
