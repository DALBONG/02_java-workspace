package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void variableP4(){
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요");
		
		System.out.print("문자열을 입력하세요 : "); 
		String str = sc.nextLine();
		
		char firChar = str.charAt(0); 
		char secChar = str.charAt(1); 
		char thrChar = str.charAt(2); 
		
		System.out.println("첫 번째 문자 : " + firChar);
		System.out.println("두 번째 문자 : " + secChar); 
		System.out.println("세 번째 문자 : " + thrChar); 
		
	}

}
