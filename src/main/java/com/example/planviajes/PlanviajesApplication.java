package com.example.planviajes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.example.planviajes", "com.example.planviajes.security"})

public class PlanviajesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanviajesApplication.class, args);
	}

}
