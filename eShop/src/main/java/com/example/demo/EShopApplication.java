package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Annotation signifies that the application is a Spring Boot application and to enable the autoconfiguration, component scan and external configuration
@SpringBootApplication
public class EShopApplication {

	public static void main(String[] args) {
		//Bootstrapping of the eShop application by starting the Spring Boot framework and loading dependencies.
		SpringApplication.run(EShopApplication.class, args);
	}

}
