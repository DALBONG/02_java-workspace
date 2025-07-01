package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {

		// 객체 생성 'new'
		Person p = new Person();
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		//생성 후 필드에 담긴 값을 바로 알아보면 JVM이 초기화까지 진행해줬음. 
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("김달봉");
		p.setAge(19);
		p.setGender('M');
		p.setPhone("010-9011-5641");
		p.setEmail("dalbong21229@naver.com");
		
		System.out.println("아이디 : " + p.getId());
		System.out.println("나이 : " + p.getAge());
		System.out.println("폰번 : " + p.getPhone());
		
		System.out.println("=================================================");
		System.out.println(p.information());
		
		System.out.println();
		
		//첫번째 방법 : 기본 생성자로 객체 생성 후 setter 메소드로 값 설명. 
		Product p1 = new Product();
		p1.setPname("갤럭시");
		p1.setPrice(1200000);
		p1.setBrand("삼성");
		
		
		// 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		Product p2 = new Product("갤럭시", 1200000, "삼성");
				//ctrl + new 뒤의 프로덕트 클릭, 여기에 this로 값을 주어야 변경된 값이 출력.
		System.out.println(p2.getpName());
		System.out.println(p2.information()); //모든 데이터 출력
		
	
		
	}

}
