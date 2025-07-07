package com.kh.Ifpractice.practice;

import java.util.Scanner;

public class IfPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		//초급
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
	}
	
	//==============================================
	//중급
	public void method2() {
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();
		System.out.println("입력3 : ");
		int num3 = sc.nextInt(); 
		
		/*
		if(num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		if(num1 > num3) {
			System.out.println(num1);
		}else {
			System.out.println(num3);
		}
		if(num2 > num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		*/
		
		/*
		if(num1 > num2) {
			System.out.println(num1);
		}else if(num1 < num2) {
			System.out.println(num2);
		}else if(num1 > num3) {
			System.out.println(num1);
		}else if(num1 < num3) {
			System.out.println(num3);
		}else if(num2 > num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		*/
		
		int max = num1;
		
		if(num2 > max) {
			max = num2;
		}
		if(num3 > max) {
			max = num3;
		}
		System.out.println("가장 큰 수 : " + max);
			
	}
//==========================================================
	public void method3() {
		//9 9 단   j x i = 
		

		for(int j=2; j<=9; j++) {
			for(int i=1; i<=9; i++) {
				//System.out.println(j + "X" + i "=" j*i);
				System.out.printf("%d x %d = %d\n", j, i, j*i);
			}
			
		}
	
		
		
		
	}
	
	
	

}
