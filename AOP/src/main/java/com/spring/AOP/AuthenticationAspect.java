package com.spring.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com.spring.AOP..*)")
    public void authenticationPointCut(){
        // A pointCut which needs to be called under the package AOP
    }

    @Pointcut("within(com.spring.AOP..*)")
    public void authorizationPointCut(){
        // within(com.spring.AOP.ShoppingCart..*)
        // A pointcut which needs to be called under shoppingCart class
    }

    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authenticate(){
        // This pointcut should be called in both the cases and can be conditioned with && or ||
        System.out.println("Authenticate");
    }
}
