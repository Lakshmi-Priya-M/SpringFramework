package com.SpringFramework.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

// Java Configurations
// Configuration Annotation tells the spring that whatever declared in this configuration class to act accordingly.
// Component Scan Annotation tells the spring to scan the bean class from the specified package
@Configuration
@ComponentScan(basePackages = "com.SpringFramework.demo")
public class BeanConfig {

    // We can manually define the bean without the annotation component similar to bean tag in xml
    /* @Bean
    public Doctor Doctor(){
        return new Doctor();
    }*/
}
