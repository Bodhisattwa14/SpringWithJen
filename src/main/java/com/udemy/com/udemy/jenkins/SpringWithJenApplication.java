package com.udemy.com.udemy.jenkins;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithJenApplication {

	 public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringWithJenApplication.class);
	public static void main(String[] args) {
		 
		 logger.info("Started to run");
		 
		SpringApplication.run(SpringWithJenApplication.class, args);
	}

}
