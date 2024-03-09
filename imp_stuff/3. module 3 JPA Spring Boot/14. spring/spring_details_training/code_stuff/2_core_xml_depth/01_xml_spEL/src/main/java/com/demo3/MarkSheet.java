package com.demo3;
public class MarkSheet {

	private String studentName;
	
	private Integer marksInMath;
	private Integer marksInPhysics;
	private Integer marksInChemistry;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getMarksInMath() {
		return marksInMath;
	}
	public void setMarksInMath(Integer marksInMath) {
		this.marksInMath = marksInMath;
	}
	public Integer getMarksInPhysics() {
		return marksInPhysics;
	}
	public void setMarksInPhysics(Integer marksInPhysics) {
		this.marksInPhysics = marksInPhysics;
	}
	public Integer getMarksInChemistry() {
		return marksInChemistry;
	}
	public void setMarksInChemistry(Integer marksInChemistry) {
		this.marksInChemistry = marksInChemistry;
	}
	@Override
	public String toString() {
		return "MarkSheet [studentName=" + studentName + ", marksInMath=" + marksInMath + ", marksInPhysics="
				+ marksInPhysics + ", marksInChemistry=" + marksInChemistry + "]";
	}
	
	
	
}