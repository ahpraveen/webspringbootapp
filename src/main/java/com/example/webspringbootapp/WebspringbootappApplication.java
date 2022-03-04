package com.example.webspringbootapp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Author: Praveen Anna Haridas
 * Role: Dev
 */
@SpringBootApplication
public class WebspringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebspringbootappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandlineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
}
