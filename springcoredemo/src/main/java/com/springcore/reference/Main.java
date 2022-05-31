package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");
		Student student = (Student) context.getBean("studentObject1");
		System.out.println(student);
		Student student2 = (Student) context.getBean("studentObject2");
		System.out.println(student2);

	}

}
