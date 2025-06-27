package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	Scanner sc = new Scanner(System.in);

	
	public void method1() {
		
		
		/*
		 switch문도 if문과 동일한 조건문임.
		 	- if문은 조건식을 자유롭게 기술 가능. 
		 	- switch문은 동등비교로 밖에 수행되지 않음.
		 	- 실행할 구문만 실행하고, 자동으로 빠져나오지 못함.(직접 break;문 작성해줘야 함)
		 	 
		 	[표현법]
		 	switch(동등비교 대상)
		 	case 값1 : 실행코드;
		 	case 값2 : 실행코드;
		 	...
		 	default : 위의 값들과 모두 일치하지 않을 경우 실행코드 (if문의 else와 같음)
		 	
		 */
		
		System.out.println("정수입력:");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("빨갱이 입니다");
			break; // 브레이크를 안걸면, 쭉 실행할 수 있음.
		case 2: System.out.println("파랭이 입니다");
			break;
		case 3: System.out.println("초랭이 입니다");
			break;
		default : System.out.println("잘못 입력했어");
		}
	}
	
	public void method2() {
		System.out.println("과일입력(사과, 바나나,복숭아) :");
		String fruit = sc.nextLine();
		int price = 0;
		
		switch(fruit) {
		case"사과" : price = 1000; 
			break;
		case"바나나" : price = 2000; 
			break;
		case"복숭아" : price = 3000;
			break;
		default : System.out.println("해당 과일은 품절데스");
		return;
		}
		System.out.println("가격: " + price + "원");
		
	}
	
	
	public void method3() {
			/*	
			등급별 권한 
			1. 관리, 글쓰기, 읽기
			2. 글쓰기, 읽기
			3. 읽기
			*/
		System.out.print("등급 : ");
		int level = sc.nextInt();
		switch(level) {
		case 1 : System.out.println("관리권한");
		case 2 : System.out.println("글쓰기권한");
		case 3 : System.out.println("읽기권한");
		}
	}
	
	public void method4() {
		System.out.println("1~12월까지 중 하나를 입력");
		int month = sc.nextInt();
			// 1,3,5,7,8,10,12 : 31일
		    // 4, 6, 9, 11 : 30일 
		    // 2월 : 28일 or 29일
		switch(month) {
		case 1: System.out.println("입력하신 월은 31일 까지 입니다."); break;
		case 3: System.out.println("입력하신 월은 31일 까지 입니다."); break;   
		case 5: System.out.println("입력하신 월은 31일 까지 입니다.");   break;
		case 7: System.out.println("입력하신 월은 31일 까지 입니다.");  break; 
		case 8: System.out.println("입력하신 월은 31일 까지 입니다.");   break; 
		case 10: System.out.println("입력하신 월은 31일 까지 입니다."); break;  
		case 12: System.out.println("입력하신 월은 31일 까지 입니다.");  
			break;
		case 4: System.out.println("입력하신 월은 30일 까지 입니다.");  break;
		case 6: System.out.println("입력하신 월은 30일 까지 입니다.");  break;
		case 9: System.out.println("입력하신 월은 30일 까지 입니다.");  break;
		case 11: System.out.println("입력하신 월은 30일 까지 입니다."); 
			break;
		case 2: System.out.println("입력하신 월은 28일 or 29일 까지 입니다."); break;
		default : System.out.println("그런 월은 존재하지 않아.");
		}
		
		
		
	}
	
	
	

}
