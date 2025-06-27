package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1(){
		/*
		 논리 연산자 (이항 연산자)
		   : 두개의 논리값을 연산해주는 연산자 
		  - 논리값 && 논리값 : 왼쪽 오른쪽 둘 다 true일 경우 결과값은 true 
		  - 논리값 || 논리값 : 왼쪽 오른쪽 둘 중 하나라도 true일 경우 결과값은 true 
		*/
		
		//사용자가 입력한 정수값이 1~100사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 :");
		int num = sc.nextInt();
		//boolean result = ( 1<= num <= 100) 이런형식은 불가
		boolean result = (1 <= num) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1~100사이 인가?:" + result);
		// && : 두 조건 모두가 True여야 결과값이 true/ 하나라도 false일 경우, 결과값은 false
		
	}
	
	public void method2() {
			//사용자가 입력한 문자값이 영어 대문자인지 확인 (A ~ Z : 65~90)70
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력:");
		char ch = sc.nextLine().charAt(0);
		
//		boolean result = (ch >= 65) && (ch <= 90);
		boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("대문자냐? : " + result);
	}

	public void method3(){
		Scanner sc = new Scanner(System.in);
				// 니 성별 입력해봐, 남자면 M / 여자면 F로
			char gender = sc.nextLine().charAt(0);
			
			boolean result = (gender == 'F') || (gender == 'f');
			System.out.println("사용자 여자?:" + result);
				// || 두 조건중 하나라도 true가 있다면 연산 결과는 true
		
	}
	
	public void method4() {
		/*
			// &&, (AND == )
				** && 연산자 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행 X
		  
			|| : 두개의 조건중 하나라도 true라면 결과값 true (== OR)
				** || 연산자 기준, 앞의 결과가 true일 경우 뒤의 조건은 굳이 실행 X
		*/
		
		int num = 10;
		boolean result1 = (num > 5) && (++num > 0);
		System.out.println("result의 값: " + result1);
		System.out.println("num의 값: " + num);
		
		int num2 = 10;
		boolean result2 = true || (++num2 > 0); 
				// dead code : 앞이 true기에 실행할 필요 X  
		System.out.println("result2의 값" + result2);
		System.out.println("num2의 값" + num2);
		
	}
	
}
