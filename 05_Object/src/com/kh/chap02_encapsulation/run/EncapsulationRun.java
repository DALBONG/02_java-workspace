package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	
	/*
	  7. 캡슐화 과정까지 적용해서 완벽한 클래스로 만듦
	  	* 캡슐화 : 추상화를 통해 정의된 속성과 기능들을 하나로 묶어 관리하는 기법중 하나.
	  	 		클래스에서 가장 중요한 목적 "데이터의 접근 제한"을 원칙으로, 
	  	 		외부로부터 직접 접근을 막고, "데이터를 간접적으로 처리"할 메소드를 클래스 내부에 작성해서 관리.	
	  	 		
	  	 1) 정보은닉 : private.
	  	 	
	*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student dal = new Student(); 
		/*
		dal.name = "김달봉";
		dal.age = 13;
		dal.height = 90.4;
		dal.korScore = 80;
		dal.mathScore = 40;
		*/
		dal.setName("달봉이"); //인수
		dal.setAge(20);
		dal.setHeight(90.2);
		dal.setKorScore(87);
		dal.setMathScore(77);
		
		System.out.println(dal.getName());
		System.out.println(dal.getAge());
		System.out.println(dal.getHeight());
		System.out.println(dal.getKorScore());
		System.out.println(dal.getMathScore());
		
		// 객체 수정사항 생겼을 경우.
		dal.setHeight(92.5);
		System.out.println(dal.getHeight());
		
	}

}
