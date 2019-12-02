package com.bigdata.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.bigdata.java.ioc.model.Person;

@SpringBootApplication
public class JavaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JavaDemoApplication.class, args);
		Person person = ctx.getBean(Person.class);
		System.out.println("Name is "+person.getName());
	}

}
