package com.kunj.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation tells spring boot that this is the starting point of the spring boot application
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		/*
		 * What does this line of code do? SpringApplication.run(CourseApiApp.class, args);
		 * (1) Sets up default configuration -- convention over configuration
		 * (2) Starts Spring Application Context
		 * (3) Performs class path scan
		 *  It checks all the classes with different annotations such as: @Controller, @Service  to treat them differently
		 *  In order to know all the annotated classes Spring perform a class path scan
		 * (4) Starts tomcat server
		 * 
		 */
		SpringApplication.run(CourseApiApp.class, args);

	}

}
