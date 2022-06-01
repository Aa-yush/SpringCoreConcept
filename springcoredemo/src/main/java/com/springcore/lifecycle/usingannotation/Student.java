package com.springcore.lifecycle.usingannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int studentId;
	private String studentName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("init() called..");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy() called.. ");
	}

}
