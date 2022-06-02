package com.springcore.autowire.usingxml;

public class Student {
	private int StudentId;
	private Address address;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int studentId, Address address) {
		super();
		StudentId = studentId;
		this.address = address;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", address=" + address + "]";
	}

}
