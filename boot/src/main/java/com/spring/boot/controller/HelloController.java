package com.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Spring wants to know that this particular class is a bean. So we must annotate with @Component.
// But here, we need to denote it as controller. So we must annotate with @Controller where inside @Controller,
// @Component is annotated. Here, we are creating REST API which gives a response body, so it is annotated as
// @RestController where @Controller is annotated inside.
@RestController
public class HelloController {

    // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public String helloWorld(){
        return "Welcome Lakshmi Priya !!";
    }
}
