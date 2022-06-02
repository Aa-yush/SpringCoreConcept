package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
		Student student = context.getBean("studentObject", Student.class); // will get the object of Student.java
		System.out.println(student);
	}
}
