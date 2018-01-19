package com.danielev86.procycling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class ProcyclingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcyclingApplication.class, args);
	}
}
