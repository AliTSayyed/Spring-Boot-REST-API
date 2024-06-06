# Spring Boot Rest API Service

Create a payroll service that manages the employees of a company. We store employee objects in a (H2 in-memory) database, and access them (through something called JPA). 
Then we wrap that with something that allows access over the internet (called the Spring MVC layer). The Spring MVC (Model-View-Controller) is a Java-based framework that's part of the Spring Framework and is used to build web applications. It's built on the Servlet API and is designed to simplify how HTTP requests and responses are handled. 

Some advantages of using a REST API over a Simple Object Access Protocol (SOAP) are:
1. Backwards compatible APIs
2. Evolvable APIs
3. Scaleable services
4. Securable services
5. A spectrum of stateless to stateful services

