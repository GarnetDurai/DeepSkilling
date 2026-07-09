package com.example.CountryCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Country.xml")
public class CountryCodeApplication {

	public static void main(String[] args) {

        SpringApplication.run(CountryCodeApplication.class, args);
	}

}
