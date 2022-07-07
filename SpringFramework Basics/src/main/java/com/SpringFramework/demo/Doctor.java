package com.SpringFramework.demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLOutput;

// Here we are just annotating Doctor class as component to let spring know that Doctor class is a component that can be used to create the bean out of it.
@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Spring will not know that there is a variable qualification inside doctor. By default, null will be assigned. If you
    // require any value to be assigned, then by using property tag under bean tag in xml file can be declared.
    // private String qualification;
    public void assist(){
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String s) {
        // In this way, we can add the custom method before the bean is ready to be served in the container
        System.out.println("Set Bean Name method is called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method is called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre Destroy method is called");
    }

    /* public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }*/
}
