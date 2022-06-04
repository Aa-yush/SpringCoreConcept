package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springscope.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student.hashCode());
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2.hashCode());
	}

}
