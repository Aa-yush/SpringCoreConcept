package com.springcore.removexml.usingannotation;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {

	@Value("201")
	private int teacherId;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public Teacher(int teacherId) {
		super();
		this.teacherId = teacherId;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + "]";
	}

	public void methodCall() {
		System.out.println("This method is calling from Teacher class");
	}

}
