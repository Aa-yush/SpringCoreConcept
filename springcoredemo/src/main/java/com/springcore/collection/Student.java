package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int studentId;
	private List<Integer> studentMarks;
	private Set<String> studentPhoneNumbers;
	private Map<String, String> studentCourses;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public List<Integer> getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(List<Integer> studentMarks) {
		this.studentMarks = studentMarks;
	}

	public Set<String> getStudentPhoneNumbers() {
		return studentPhoneNumbers;
	}

	public void setStudentPhoneNumbers(Set<String> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	public Map<String, String> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(Map<String, String> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public Student(int studentId, List<Integer> studentMarks, Set<String> studentPhoneNumbers,
			Map<String, String> studentCourses) {
		super();
		this.studentId = studentId;
		this.studentMarks = studentMarks;
		this.studentPhoneNumbers = studentPhoneNumbers;
		this.studentCourses = studentCourses;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentMarks=" + studentMarks + ", studentPhoneNumbers="
				+ studentPhoneNumbers + ", studentCourses=" + studentCourses + "]";
	}

}
