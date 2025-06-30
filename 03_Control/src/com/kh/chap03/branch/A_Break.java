package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	Scanner sc = new Scanner(System.in);
	/*
	 break: 반복문 안에 사용되는 분기문
	 	break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	*/
	
	public void method1() {
			// 랜덤값 발생 후 랜덤값 출력(무한 반복)
			// 랜덤값이 3의 배수일 경우 반복문을 빠져나가기
		while(true) { //while 조건이 true일 경우 무한 반복
			int random = (int)(Math.random() * 100 + 1);
			System.out.println("랜덤값 : " + random);
			
			if(random % 3 == 0) {
				break;
			}
		}	
	}
	
	
	public void method2() {
			// 문자열 입력 받고, 길이를 출력
			// "exit" 끝내기
		while(true) {
			System.out.print("문자열 입력 :");
			String str = sc.nextLine();
			
		if(str.equals("exit")) {
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("문자열 길이" + str.length());
		}
			
		}
		
	}
	

}
