package com.springcore.removexml.usingannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("101")
	private int studentId;
	@Value("Ayush Gupta")
	private String studentName;

	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

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
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", teacher=" + teacher + "]";
	}

}
