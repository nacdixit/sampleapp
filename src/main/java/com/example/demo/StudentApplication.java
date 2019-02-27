package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jmx.export.MBeanExporter;

@SpringBootApplication
public class StudentApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(StudentApplication.class);
	    }
	 
	
	
}

