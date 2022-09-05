package com.example.configurationprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration()
@ComponentScan(basePackageClasses = {DatabaseProperties.class})
//@SpringBootApplication
public class ConfigurationProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationProcessorApplication.class, args);
	}

}
