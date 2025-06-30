package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	public void method1() {
		/*
		  *do while문
		   do { 
		   		반복적으로 실행할 코드	(무조건 실행)
		   	}while(조건식);
		   	
		  *for/while 문과의 차이점
		  	: 조건 검사 후 true여야만 수행,
		  	do while은 조건 검사 없이 무조건 한번은 수행 후
			조건 검사 (실무에서 쓰이진 않으나, 면접에서 많이 질문)
		*/
		
		int num = 1;
		do {
			System.out.println("num : " + num);
		}while(false);
	}
	
	
	
	
	public void method2() {
		int i = 1;
		do { 
			System.out.print(i + " ");
			i++;
		}while(i<=5);
	}

	
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : " );
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i <= num);
		System.out.println("총 합계 : " + sum);
	}
	
	
	
	
	
	
	
	
}
