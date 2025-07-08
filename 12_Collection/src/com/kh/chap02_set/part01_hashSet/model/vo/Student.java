package com.kh.chap02_set.part01_hashSet.model.vo;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && score == other.score;
	}
	
	
	
	/*
	@Override
	public int hashCode() { //모든 필드의 값이 일치하면 동일한 해시코드 반환
		String str = name + age + score; // 공휴43100, 박복엄3020, 등..
		return str.hashCode(); // String의 해시코드 
	}
	*/
	
	/*
	@Override
	public boolean equals(Object obj) {//현재 객체와 전달받은 개체의 각 필드값이 모두 일치하면 True, 하나라도 다르면 False 반환
		  // this 현재 객체   vs obj 전달받는 객체
		  // this.name	   vs obj.name		일치 여부
		  // this.age	   vs obj.age		
		 // this.score	   vs obj.score		
		
		Student other = (Student)obj;
		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score){
			return true;
		}else {
			return false;
		}
	}
	*/
	


}
