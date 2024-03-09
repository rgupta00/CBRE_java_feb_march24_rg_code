package com.demo5;

import java.util.List;

public class StudentListAccessor {

	private Student thirdStudentInList;
	private List<Student> failedStudents;
	private List<String> studentNames;
	public Student getThirdStudentInList() {
		return thirdStudentInList;
	}
	public void setThirdStudentInList(Student thirdStudentInList) {
		this.thirdStudentInList = thirdStudentInList;
	}
	public List<Student> getFailedStudents() {
		return failedStudents;
	}
	public void setFailedStudents(List<Student> failedStudents) {
		this.failedStudents = failedStudents;
	}
	public List<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
}