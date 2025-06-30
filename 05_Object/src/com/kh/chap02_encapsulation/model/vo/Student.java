package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// 필드부
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
			//퍼플릭 으로 하는 것은 캡슐화 접근제한자의 잘못된 제시
	
	// 생성자부
	
	// 메소드부
		/*
		  접근제한자 반환형(void) 메소드명([매개변수]){
		  	실행 코드
		  }
		  
//------------------------------------------------------------------------
		   setter 메소드
		  	해당 필드에 대입시키고자 하는 값을 전달받아, 대입시켜주는 기능을 하는 메소드
		*/
	
	 //public void setName(String newName) {	//매개변수
		 //name = newName; 
		 // -> 관례적으로 틀린 표현
		 
	 public void setName(String Name) {	//매개변수
		 this.name = Name;  // -> this.기존변수
	 }
	 
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 public void setHeight(double height) {
		 this.height = height; 
	 }
	 
	 public void setKorScore(int korScore) {
		 this.korScore = korScore;
	 }
	 public void setMathScore(int mathScore) {
		 this.mathScore = mathScore;
	 }
	 
//----------------------------------------------------------------
	 
	 // getter 메소드
	 // -> 해당 필드에 담긴 값을 반환해주는 역할 수행.
	 
	 public String getName() {
		 return name;  //void -> String(뱉어내는 자료형 이름으로)
	 }
	 public int getAge() {
		 return age;
	 }
	 public double getHeight() {
		 return height;
	 }
	 public int getKorScore() {
		 return korScore;
	 }
	 public int getMathScore() {
		 return mathScore;
	 }
	 

}
