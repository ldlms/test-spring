package com.springTest.spring_first_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringFirstAppApplication.class,
				args);
		BeanTest component = applicationContext.getBean(BeanTest.class);
		System.out.println(component.getMessage());

	}

}
