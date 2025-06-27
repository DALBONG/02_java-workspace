package com.kh.operator;

public class C_Arithmetic {
	/* 산술 연산자
	   + - * / % 
	   * / % > + - (연산 우선순위)
	*/
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2));
		
		// 값 % 2 == 0 짝수 
		// 값 % 2 == 1 홀수
		// 값 % 5 == 0 5의 배수
	
		
	}

}
