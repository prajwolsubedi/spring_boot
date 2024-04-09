package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
@SpringBootApplication(
	scanBasePackages = {"com.example.demo","util"})
 */
@SpringBootApplication
public class TryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryApplication.class, args);
	}

}
