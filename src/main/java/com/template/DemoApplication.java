package com.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	 static void main(String[] args) {
         System.out.println("service is running on http://localhost:8080/");
         SpringApplication.run(DemoApplication.class, args);
	}

}
