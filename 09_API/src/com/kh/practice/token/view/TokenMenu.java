package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	//필드
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
			
	public void mainMenu() {
		// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복 
		int menu = 0;
		System.out.print("1. 지정 문자열 :  ");
		menu = sc.nextInt();
		sc.nextLine();
		//System.out.println(menu);
		System.out.print("2. 입력 문자열:  ");
		menu = sc.nextInt();
		sc.nextLine();
		//System.out.println(menu);
		//System.out.println("3. 프로그램 끝내기");
		
		if(menu == 1) {
			tokenMenu();
		}else if(menu == 2) {
			inputMenu();
		}
	}
	

	public void tokenMenu() {
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력 
		// TokenController(tc)의 afterToken()의 반환 값을 가지고 
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력 
		
		System.out.println("메뉴 번호");
		
		String str = "J a v a p r o g r a m ";
		System.out.println(str);
		tc.afterToken(str);		
		System.out.println(str.length());
		System.out.println(tc.afterToken(str));
		System.out.println((tc.afterToken(str)).length());
		System.out.println((tc.afterToken(str)).toUpperCase());

	}
	
	public void inputMenu() {
		
		System.out.print("문자열을 입력하세요 : ");
		String str2 = sc.nextLine();
		System.out.println(str2); 
		tc.firstCap(str2);
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력 
		
		
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨 
		// 반환 값 출력

	
		
	
	}
	
	
	

}
