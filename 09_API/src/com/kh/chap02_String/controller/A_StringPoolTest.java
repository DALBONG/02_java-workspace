package com.kh.chap02_String.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		/*
		int a = 10; // 기본자료형
		String s = "안녕"; // 참조자료형
		*/
		
		//1. 생성자를 통해 문자열 생성
		String str1 = new String("Hello"); //매개 변수 생성자로 초기화
		String str2 = new String("Hello"); 
		
		System.out.println(str1.toString());
		System.out.println(str2);
		  // String클래스에 toString() 메소드가 이미 오버라이딩 되어있음.
		
		//동등비교
		System.out.println(str1 == str2); //주소값을 담고있어 false
		System.out.println(str1.equals(str2));
			// String 클래스에 equals()메소드가 이미 오버라이딩 되어있음. 
		     // Object클래스 확인하면, 원래는 주소값을 동등비교하는 메소드임 
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
			/*  String 클래스의 hashCode도 이미 오버라이딩 되어있음
			 주소값이 아닌, 스트링 내 값에 담겨있는 문자열을 가지고 해시코드 많듦. */
		//주소값 봐야겠어
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	
	public void method2() {
		String str = new String("hello");
		//문자열 값을 리터럴 값으로 생성.
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		
		System.out.println(str1 == str2); //? 왜true? (주소값 일치?)
		
		System.out.println("str1의 주소값: " + System.identityHashCode(str1));
		System.out.println("str2의 주소값: " + System.identityHashCode(str2)); // ?주소값 같노
		System.out.println("str의 주소값: " + System.identityHashCode(str)); 
		String str3 = "hi";
		System.out.println(str1 == str3);
		System.out.println("str3의 주소값: " + System.identityHashCode(str3)); // 이건 또 다르네
		
		/* 왜그럴까?
		   String 클래스 == 불변클래스 
		   값을 못바꾸는것이 아니라, 만든 박스가 수정되지 않음.
		   변경은 가능하나, 수정되는 개념이 아니라, 새로 만드는 개념.
		*/
		
		str3 = "bye";
		System.out.println("str3의 주소값: " + System.identityHashCode(str3));

		str3 = "hello";
		System.out.println("str3의 주소값: " + System.identityHashCode(str3));
		
		
	}

}
