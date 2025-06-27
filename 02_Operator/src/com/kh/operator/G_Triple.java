package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	public void method1() {
		/*
		 3항 연산자(항3)
		 [표현법]
		  (조건식) ? 조건식이 참일경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값 
		     이때, 조건식은 반드시 true, false가 나오도록 작성해야 함
		     주로 비교연산자, 논리 연산자를 통해 작성
		*/
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("정수입력");
	 int num = sc.nextInt();
	 
	 //String result = 조건 > 참일때 : 거짓일 때
	 String result = (num > 0) ? "양수 입니다" : "양수가 아닙니다.";
	 System.out.println(num + "은" + result);
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 :");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0 ? "짝수 입니다." : "홀수 입니다");
		System.out.println(num + "은" + result);
		
	}
	
	public void method3() {
			// 삼항 연산자 중첩
		Scanner sc = new Scanner(System.in);
		System.out.println("정수:");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수입니다." : (num == 0) ? "0입니다." : "음수 입니다";
		System.out.println(num + "은" + result);
		
	}
	
	public void method6( ) { 
			// 사용자에게 두개의 정수를 입력 받고,
			// 연산자 입력 (+ 또는 -)받아 그에 맞는 연산결과를 출력.
			// 단, + 나 -가 아닌, 다른 문자를 입력했을 경우, "잘못 입렸습니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자(+ or -) :");
		char oper = sc.nextLine().charAt(0);
		
		String result = (oper == '+') ? (num1 + num2 + "") : (oper == '-') ? (num1 - num2 + "") : "잘못 입력했어";
		System.out.println("결과" + result);
	
		
	}
	
	
	
	

}
