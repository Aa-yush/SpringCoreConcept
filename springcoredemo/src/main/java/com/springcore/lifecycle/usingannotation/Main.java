package com.springcore.lifecycle.usingannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleannotation.xml");
		Student student = (Student) context.getBean("studentObject");
		System.out.println(student);
		context.registerShutdownHook();

	}

}
