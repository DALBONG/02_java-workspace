package com.kh.chap03.override.run;

import com.kh.chap03.override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {

		Book bk1 = new Book("수학의 정석", "나수학", 7000);
		Book bk2 = new Book("칭찬은 고래", "김새우", 6000);
		
		System.out.println(bk1);
		System.out.println(bk2);
		
		
		//int a = 10;  -> X : toString은 객체일떄만 붙음. 
		/*
		 출력문에 레퍼런스 객체를 출력하고자 할 때, 
		 JVM이 자동으로 해당 레퍼런스 객체 .toString() 메소드를 호출
		 
		 오버라이딩 전: 오브젝트 클래스의 toString() 실행 -> 풀클래스명 + @ + 객체의 16진수 주소값 리턴
		 오버라이딩 후: Book 클래스의 toString 실행 -> 해당 객체가 가지고 있는 모든 필드값을 한 문자열로 합쳐 리턴
		*/
		 
		 
		 
		 
		 
	}

}
