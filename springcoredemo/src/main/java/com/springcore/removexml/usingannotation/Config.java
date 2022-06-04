package com.springcore.removexml.usingannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.removexml.usingannotation")
public class Config {

	@Bean
	public Teacher getTeacherObject() {
		Teacher teacher = new Teacher();
		return teacher;
	}

	@Bean
	public Student getStudentObject() {
		Student student = new Student(getTeacherObject());
		return student;
	}

}
