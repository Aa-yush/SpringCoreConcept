package com.springcore.autowire.usingannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int studentId;
	@Autowired
	private Address address;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired - use here for setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, Address address) {
		super();
		this.studentId = studentId;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", address=" + address + "]";
	}

}
