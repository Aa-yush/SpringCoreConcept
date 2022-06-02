package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollection.xml");
		Student student = context.getBean("studentObject", Student.class);
		System.out.println(student);
	}

}
