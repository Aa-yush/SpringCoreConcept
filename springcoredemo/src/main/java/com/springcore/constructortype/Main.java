package com.springcore.constructortype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("constructortype.xml");
		Student student = (Student) context.getBean("studentObject");
		System.out.println(student);

	}

}
