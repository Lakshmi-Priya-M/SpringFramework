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
