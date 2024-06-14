package com.DanVegaTesting.DanVegaTesting;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DanVegaTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanVegaTestingApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(){
//		return args -> {
//			System.out.println("Something went wrong");
//			throw new RuntimeException("Error Something went wrong");
//		};
//	}
}
