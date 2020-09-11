package com.madan.electricity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories("com.madan.repository")
@ComponentScans({ 
    @ComponentScan(basePackages = "com.madan.controller")
})
@SpringBootApplication
public class ElectricityApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ElectricityApplication.class, args);
	}
}
