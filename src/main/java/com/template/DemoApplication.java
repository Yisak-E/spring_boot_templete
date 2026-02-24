package com.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class DemoApplication {
	 static void main(String[] args) {
         System.out.println("service is running on http://localhost:8080/");
         BCryptPasswordEncoder bc = new  BCryptPasswordEncoder(10);
         System.out.println(bc.encode("123456"));
         SpringApplication.run(DemoApplication.class, args);
	}
}


