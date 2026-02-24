package com.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.template.security.JwtUtil;


@SpringBootApplication
public class DemoApplication {
	 static void main(String[] args) {
         System.out.println("service is running on http://localhost:8080/");


//         BCryptPasswordEncoder bc = new  BCryptPasswordEncoder(10);
//         System.out.println(bc.encode("123456"));

          ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

          JwtUtil jwtUtil = context.getBean(JwtUtil.class);

          String username = "testUser";
          String token = jwtUtil.generateToken(username);


         System.out.println("=== JWT TEST ===");
         System.out.println("Username: " + username);
         System.out.println("Generated Token: " + token);
         System.out.println("Extracted Username: " + jwtUtil.extractUsername(token));
         System.out.println("Token Expiration: " + jwtUtil.extractExpiration(token));
         System.out.println("Is Valid: " + jwtUtil.validateToken(token, username));

         // Test with wrong username
         System.out.println("Is Valid (wrong user): " + jwtUtil.validateToken(token, "wronguser"));



//         SpringApplication.run(DemoApplication.class, args);
	}
}


