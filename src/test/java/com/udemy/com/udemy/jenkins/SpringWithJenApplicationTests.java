package com.udemy.com.udemy.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringWithJenApplicationTests {

	 public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringWithJenApplication.class);

	@Test
	void contextLoads() {
		

		logger.info("I do see it starting");
		logger.info("Test starting");
		assertEquals(true,true);
		
	}

}
