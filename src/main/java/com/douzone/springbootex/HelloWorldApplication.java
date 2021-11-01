package com.douzone.springbootex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 
 * Bootstrap Class
 * 
 */

@SpringBootApplication
public class HelloWorldApplication { 
	public static void main(String[] args) {
		// HelloWorldApplication 넣어주는데 configuration으로 작동한다...
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
