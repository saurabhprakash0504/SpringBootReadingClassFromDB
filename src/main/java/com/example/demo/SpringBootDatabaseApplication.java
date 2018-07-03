package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDatabaseApplication {

	@Autowired
	static SampleController samplesss;
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(SpringBootDatabaseApplication.class, args);
		samplesss=(SampleController)applicationContext.getBean("SampleController");
		samplesss.getContext(applicationContext) ;
		
	}
}
