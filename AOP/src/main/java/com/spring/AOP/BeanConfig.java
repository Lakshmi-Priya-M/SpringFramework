package com.spring.AOP;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.spring.AOP")
@EnableAspectJAutoProxy // Enables support for handling components marked with AspectJ's @Aspect annotation
public class BeanConfig {
}
