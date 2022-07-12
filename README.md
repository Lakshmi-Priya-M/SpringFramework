# SpringFramework

# AOP 
DEFINITION - 
AOP stands for ASPECT ORIENTED PROGRAMMING.
AOP is the methodology which we will create the application similar to OOPS.
AOP gives the flexibility to remove the cross cutting concerns from the applications and to seperate it from the main business logics.

What is cross cutting concerns and why we need to seperate it out?

Let's take an example of shopping cart. In Shopping cart, we add an items or remove an item and then we will checkout the shopping cart and place the order by making the payment and delivery address. To do all these things, we write the code based on the business logics. And also, we follow the below points while writing the code for each request which are completely different from business logics and these are known as cross cutting concerns.

1. Loggers- We write loggers whenever a issue is raised, a developer can easily debug and track the issue cause.
2. Authentication and Authorization - We will try to handle authentication and authorization for each request the user calls.
3. Converting an input data - We might require to santize the data before processing it. Lets say converting a string to json data.

Here, the AOP super man comes to seperate the cross cutting concerns from the business logic and maintain and run it seperately.

# Spring Boot

1. What is Spring ? and What is Spring Boot ?

Spring : 

Spring is a Java Framework built to create an enterprise ready application. To create a java application, lot of configurations, properties, packages, modules and jar files are required to be added.
Spring is a framework that allows the developer to create an application for different activity.  There are lot of modules available in spring framework i.e Spring Core, Spring MVC, Spring Batch, Spring Data JPA, Spring Web, Spring Data which can be used as per the requirement. 
In Spring , you have to concentrate on configurations as well as the business logic. For example, If you need to include Hibernate, it's configuration need to be added. 
If you need to include cache, it is required to do configurations. So, a lot of configurations are required when we are working in Spring. Once it is developed, it has to be deployed in application server or web server. Spring Framework makes it easy to create an application, but a lot of configurations are required to be added apart from the main business logic.

Spring Boot :

Spring Boot is an advanced version of Spring Framework where we can concentrate only on Business logic where the configurations are taken care by Spring. Spring Boot provides the rapid application development. i.e it allows to create an application easily. Spring Boot also provides a different starter template that includes all the dependency that are required to do a particular job. If you want to work in jdbc task, you can just download the spring boot jdbc starter template with all the mandatory dependency are provided.

Advantage :

Spring Boot provides the auto configuration. 
It also provides the embedded server. Once the application is created, a war file is generated. and the war file is deployed into any of the application server or web server. (JBOss, tomcat)  In spring Boot, that particular server is embedded to that entire application. 

It is always a production ready since we can use the jar file in any of the environment. 

Spring Boot is the default option to create a microservice application since the market is going towards the microservice instead of monolithic application service.

2. What is Depedency Injection ?

In any of the programming language, Dependency Injection pattern is used to create an object. For example, to create a student object, we manually create it like below,
Student s1 =  new Student();

In an enterprise application, there will be many classes which will be interlinked. It is highly difficult to create an object manually in such a scenario. Hence, inversion of control principle came over here to solve this.

Inversion of control is nothing but giving the control from the developer to the spring to take care of the object creation and it's dependency. 

To follow this principle, we use the pattern dependency injection. If subject is the dependent object of student. Spring will take care to create the subject object when it's required. 

If spring boot application is started, it will have all the beans or the objects in the factory. All the objects will be created when the spring boot context is started. Then all the beans will be stored in the container. Whenever the bean is needed, we can access it through the spring factory or the application context where the spring retrieves the objects from the container. 

3. What is Spring Initializer ?

Spring Boot provides a tool i.e Spring Initializer which is a bare minimum base to create an application. 
https://start.spring.io/ is a tool which is called as spring initializer. 

4. Creating Simple API

@SpringBootApplication - key annotation for a spring boot application which denotes the main configuration application file and also enables auto configuration which can be seen under the @SpringBootApplication annotation. We can also exclude the auto configuration. 
@componentscan - By default, the packages that are annotated with springboot application are scanned and it stores the beans from that particular packages.
If we wanted to add other packages, we must add @componentScan.

The below link can be used to know all the configuration that can be declared in application properties file which can be configured manually.
https://docs.spring.io/ 

To run the spring boot application using command, enter the below command in terminal
mvn spring-boot:run

In right side, if you see maven tab, you can see the different lifecycle of spring boot application which can also be clicked to run the application.

springboot-Dev-tools dependency allows to build the changes automatically instead of stopping and running the application after each change.

5. Architecture

![architecture](https://user-images.githubusercontent.com/63499584/178547932-2a05ce1e-1625-4116-aec4-6b2c123e525f.png)








