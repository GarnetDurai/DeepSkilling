package com.example.Spring_Hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:Country.xml")
public class SpringHelloApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringHelloApplication.class);
	public static void main(String[] args) {
        logger.info("Application Started");
        SpringApplication.run(SpringHelloApplication.class, args);

        logger.info("Application Ended");
	}

}
