package com.springcore.constructortype;
/*
 * Ambiguity with Constructor
 * 
 * When we are injecting properties using contructor by default String type of values assigned from the config file.
 * So, by default it call (String, String) constructor
 * 
 * If we dont have (String, String) constructor than it will have ambiguity b/w (double) and (int) constructor.
 * In this case, whichever constructor come first in order it will call that constructor.
 * 
 * To remove this ambiguity we can use type and index attribute with <constructor-args> tag in config xml file
 * 
 * */

public class Student {
	private int studentId;
	private int studentMarks;

	public Student(double studentId, double studentMarks) {
		this.studentId = (int) studentId;
		this.studentMarks = (int) studentMarks;
		System.out.println("double - double contructor calling");
	}

	public Student(int studentId, int studentMarks) {
		this.studentId = studentId;
		this.studentMarks = studentMarks;
		System.out.println("int - int constructor calling");
	}

//	public Student(double studentId, double studentMarks) {
//		this.studentId = (int) studentId;
//		this.studentMarks = (int) studentMarks;
//		System.out.println("double - double contructor calling");
//	}

//	public Student(String studentId, String studentMarks) {
//		this.studentId = Integer.parseInt(studentId);
//		this.studentMarks = Integer.parseInt(studentMarks);
//		System.out.println("String - String contructor calling");
//	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentMarks=" + studentMarks + "]";
	}

}
