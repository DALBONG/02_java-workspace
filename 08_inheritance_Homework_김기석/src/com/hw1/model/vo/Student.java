package com.hw1.model.vo;

public class Student extends Person {

	private int grade;
	private String major;
	
	public Student(){}
	
	public Student(String name, int age, double height, double weight, int grade, String major){
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
		
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", "+ grade +", "+ major;
	}
	
	
	
}
