package com.kh.chap01_abstraction.model.vo;
	
	/*
	 클래스의 구조
	 public class 클래스명{

	  필드부
	 	  
	  생성자부	
	 
	  메소드부(public void method1..)
	  
	  
	 }
	*/



public class Student { // 학생을 추상화해서 만든 클래스
	
	// Student 클래스의 필드 부
	// 접근제한자 자료형 변수명
	
	// *접근 제한자 : 필드에 접근할 수 있는 범위 제한
	// 			  public > protectied > default > private
	
	public String name; // 이름
	public int age; // 나이
	public double height; // 키

}
