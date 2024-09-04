package com.springTest.spring_first_app;

import org.springframework.stereotype.Component;

@Component
public class BeanTest {

	public String getMessage() {
		return "test du bean";
	}
}
