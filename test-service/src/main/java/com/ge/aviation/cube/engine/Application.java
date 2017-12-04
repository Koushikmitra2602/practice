package com.ge.aviation.cube.engine;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	private static final Logger LOGGER = Logger.getLogger(Application.class);
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}