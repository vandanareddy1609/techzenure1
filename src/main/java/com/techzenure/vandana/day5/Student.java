package com.techzenure.vandana.day5;
/**
 * program to print student details using constructor
 * @author Vandana
 */
public class Student 
{
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		collegeName="NIT";
	}
	public Student() {
		
	}
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	

}
