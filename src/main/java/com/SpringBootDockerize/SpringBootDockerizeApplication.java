package com.SpringBootDockerize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerizeApplication.class, args);
	}	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to first dockerize app..!!";
	}


}
