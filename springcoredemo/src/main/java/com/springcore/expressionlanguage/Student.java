package com.springcore.expressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
//	Expression Language using primitive values
	@Value("#{13+101}")
	private String studentId;

	@Value("Ayush Gupta")
	private String studentName;

//	Expression Language called static method
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double sqrtValue;

	@Value("#{T(java.lang.Math).PI}")
	private double piValue;

	@Value("#{ new java.lang.String('My Name is ayush')}")
	private String stmt;

	@Value("#{ 18 > 16 }")
	private boolean studentAgeVerify;

	public String getStmt() {
		return stmt;
	}

	public void setStmt(String stmt) {
		this.stmt = stmt;
	}

	public String getStudentId() {
		return studentId;
	}

	public double getPiValue() {
		return piValue;
	}

	public void setPiValue(double piValue) {
		this.piValue = piValue;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getSqrtValue() {
		return sqrtValue;
	}

	public void setSqrtValue(double sqrtValue) {
		this.sqrtValue = sqrtValue;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isStudentAgeVerify() {
		return studentAgeVerify;
	}

	public void setStudentAgeVerify(boolean studentAgeVerify) {
		this.studentAgeVerify = studentAgeVerify;
	}

	public Student(String studentId, String studentName, double sqrtValue, double piValue, String stmt,
			boolean studentAgeVerify) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.sqrtValue = sqrtValue;
		this.piValue = piValue;
		this.stmt = stmt;
		this.studentAgeVerify = studentAgeVerify;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", sqrtValue=" + sqrtValue
				+ ", piValue=" + piValue + ", stmt=" + stmt + ", studentAgeVerify=" + studentAgeVerify + "]";
	}

}
