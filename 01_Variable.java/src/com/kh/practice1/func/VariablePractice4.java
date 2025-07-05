package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void variableP4(){
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요");
		
		System.out.print("문자열을 입력하세요 : "); 
		String str = sc.nextLine();
		
		char firChar = str.charAt(0); 
		char secChar = str.charAt(1); 
		char thrChar = str.charAt(2); 
		
		System.out.println("첫 번째 문자 : " + firChar);
		System.out.println("두 번째 문자 : " + secChar); 
		System.out.println("세 번째 문자 : " + thrChar); 
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("문자열을 입력하세요(3글자 이상) : ");
		String alpa = sc.nextLine();
		System.out.println("첫번째 문자 : " + alpa.charAt(0));
		System.out.println("두번째 문자 : " + alpa.charAt(1));
		System.out.println("세번째 문자 : " + alpa.charAt(2));
		
		// 3글자 미만일 경우, 출력 안되고, 경고문 발생하게 하기.
		for(int i=0; i<=alpa.length()) {
			
		}else if(alpa.length()<=2) {
			System.out.println("3글자 이상 적어주세요!");
			return ;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
