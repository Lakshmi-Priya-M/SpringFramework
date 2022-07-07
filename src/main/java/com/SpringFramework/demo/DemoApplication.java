package com.SpringFramework.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {

		// The objects which are created in the project is called beans.
		// When Application is started, spring loads all the beans in the container. The BeanFactory or ApplicationContext is called where it acts as an interface to get the beans from the container.
		// There are two factories available. 1. BeanFactory 2. ApplicationContext.
		// These interfaces help to load the beans.
		// The difference between BeanFactory and ApplicationContext is that ApplicationContext extends BeanFactory.

		// ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		// Pass the class or the id in the getBean method to get the object
		Doctor doctor = context.getBean(Doctor.class);
		doctor.setQualification("MBBS");
		doctor.assist();
		System.out.println(doctor);

		// Whenever we declare a bean, we must define the scope of the bean as well.
		// There are different scopes available
		// 1. Singleton - for the whole application, there will be only one object is created. By default, the scope is singleton
		// 2. Prototype - whenever a request is made to get the bean from the container, an object is created.
		// 3. Request - the below three scopes are mostly used in mvc
		// 4. Session -
		// 5. Global Session -

		Doctor doctor1 = context.getBean(Doctor.class);
		System.out.println(doctor1);

		Nurse nurse = (Nurse) context.getBean("nurse");
		nurse.assist();

		// Here we are simply structured the code with an interface staff
		Staff staff = context.getBean(Doctor.class);
		staff.assist();
	}

}
