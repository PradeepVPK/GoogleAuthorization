package com.login.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.login.google"})
public class GoogleLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleLoginApplication.class, args);
	}

}
