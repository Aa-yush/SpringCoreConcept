package com.springcore.lifecycle.usingxml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclexml.xml");
		Student student = (Student) context.getBean("studentObject");
		System.out.println(student);
		context.registerShutdownHook(); // It will call destroy method, defined in AbstractApplicationContext class

	}

}
