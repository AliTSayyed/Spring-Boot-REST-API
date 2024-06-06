
/*
Big picture: We’re going to create a simple payroll service that manages the employees of a company.
We’ll store employee objects in a (H2 in-memory) database, and access them via a JPA (Java Persistence API). 
Then we’ll wrap that with something that will allow access over the internet (called the Spring MVC layer).
*/

package com.example.Payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
meta-annotation that pulls in component scanning, autoconfiguration, and property support.
This tells Spring Boot to help out wherever possible. In essence, it starts a servlet container and serves up our service.
 */ 

@SpringBootApplication 
public class PayrollApplication {
	public static void main(String[] args) {
		SpringApplication.run(PayrollApplication.class, args);
	}

}
