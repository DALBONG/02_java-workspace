package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
	public void method1() {
		/*
		 비교 연산자 / 관계 연산자 (이항 연산자)
		  : 두 값을 비교하는 연산자.
		  - 비교 연산자 : 조건을 만족하면 true, 만족하지 않으면 false 반환
		    --> 즉, 비교연산자의 결과값은 논리값
		  	+ 대소비교 연산자 < > <= =>
		   	+ 동등비교 연산자 == !
		*/
		
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a <= b : " + (a <= b));
		boolean result = a > b; //논리값을 담으려면, boolean
		
		System.out.println("a는 짝수? : " + (a % 2 == 0));
		System.out.println("a는 홀수? : " + (a % 2 == 1));
		System.out.println("a는 홀수? : " + !(a % 2 == 0));	
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("첫번째 정수:");
		int num1 = sc.nextInt();
		
		System.out.println("두번재 정수 : ");
		int num2 = sc.nextInt();
		
		
		System.out.println("첫번째가 두번째보다 크냐? : "+(num1>num2));
		System.out.println("첫번째가 정수가 짝수인가? : "+(num1 % 2 ==0));
		
		System.out.println(num2 < 'A');
		
		
	}
}
