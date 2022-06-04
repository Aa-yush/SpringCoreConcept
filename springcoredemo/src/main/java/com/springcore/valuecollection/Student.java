package com.springcore.valuecollection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("101")
	private int studentId;
	@Value("#{studentNumber}")
	private List<String> studentNumber;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public List<String> getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(List<String> studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, List<String> studentNumber) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + "]";
	}

}
