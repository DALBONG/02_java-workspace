package com.kh.chap04_field.model.vo;
	/*
	 변수 구분
	 
	 - 전역 변수 : 클래스 영역에 바로 선언한 변수 
	 			-> 클래스 내에서 어디서든 전 역으로 사용 가능. 
	 - 지역 변수 : 클래스 영역 내 어떤 특정한 구역에(){} 선언한 변수
	 			-> 선언된 해당 그 지역에서만 사용 가능.
	 			
	 1. 전역 변수 (== 멤버 변수 == 인스턴스 변수)
	  - 생성시점 : new 라는 연산자를 통해 객체 생성시 
	  - 소멸시점 : 객체가 소멸시 같이 소멸
	  
	 +. 클래스 변수 : static 변수
	  - 생성시점 : 프로그램 실행과 동시에 무조건 메모리 영역에 할당
	  			-> static 영역에
	  - 소멸시점 : 프로그램 종료 후 소멸 
	  
	 2. 지역 변수 
	  - 생성시점 : 속해있는 특정 구역(){} 실행시 메모리 영역에 할당
	  - 소멸시점 : 특정한 구역 종료시 소멸
	*/

//변수 선언 위치에 따른 구분을 보기 위한 클래스
public class FieldTest1 {

	//1. 전역변수(field)
	private int global;
	
	
	public void test1(int num) {
		//매개 변수 => 지역변수
		int local; // 지역변수
		
		//전역변수 출력 -> 객체 생성시 JVM이 초기값으로 초기화
		System.out.println(global);
		
		//매개변수 -> 이 메소드 호출시 반드시 값 전달.
		System.out.println(num);
		
		//System.out.println(local); //초기화가 안되어있음. 오류남.
	}
	
}
