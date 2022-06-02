package com.springcore.autowire.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowirequalifier.xml");
		Student student = context.getBean("studentObject", Student.class);
		System.out.println(student);

	}

}
