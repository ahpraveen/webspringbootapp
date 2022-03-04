package com.example.webspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Praveen Anna Haridas
 * Role: Dev
 */
@SpringBootApplication
@RestController
public class WebspringbootappApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(WebspringbootappApplication.class, args);
	}

	@GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue = "World") String name){
		return String.format("Hello %s", name);
	}
}
