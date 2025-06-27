package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
			/*
			  While문
			   while(조건식){
			   		반복적으로 실행할 코드; 
			   		[증감식;]
			   }
			*/
	
	public void method1() {
		
		int i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
	}
	
	
	public void method2() {
		int i = 1;
		while(i <=10 ) {
			if(i % 2 == 1){
				System.out.println(i + "");
			}
			i++;
		}
		
	}
	
	
	/*
	public void method3() {
			//1부터 100까지 랜덤값의 총 합계
		int random = (int)(Math.random() *100 + 1);
		
		int sum = 0;
		int i = 1; //초기식
		while(i<=random) {
			sum += i;
		} i++;
		System.out.println("1부터 " + random + "까지의 합" + sum);	
	}
	*/
	
	
	public void method4() {
		/*
		Scanner sc = new Scanner(System.in);
			
			System.out.println("문자열 입력해 :");
			String str = sc.nextLine();
			
			System.out.println("문자열의 길이:" + str.length());
			
			for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i));
			}
			
			문자열 입력해 :   DALBONG  /문자열의  길이:7  DALBONG
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력해!");
		String str = sc.nextLine();
		
		int i=0;
		while(i < str.length()){
			System.out.print(str.charAt(i));
			i++;
		}-

		
	}
	
	
	
	
}
