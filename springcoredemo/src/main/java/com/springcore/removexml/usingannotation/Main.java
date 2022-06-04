package com.springcore.removexml.usingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean("getStudentObject", Student.class);
		System.out.println(student);

		Teacher teacher = student.getTeacher();
		teacher.methodCall();

	}

}
