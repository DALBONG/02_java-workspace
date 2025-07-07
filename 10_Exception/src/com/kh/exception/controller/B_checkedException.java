package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_checkedException {

	/*
	 반드시 예외처리를 해야하는 예외들임 (예상X)
	  - 조건문 미리 제시 불가 (예측이 불가능한 곳에서 문제가 발생하기 때문에 미리 예외처리 구문을 작성해야함)
	  - 외부 매개체와 입출력이 일어날 때 발생(IOException)
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	
	public void method2() throws IOException {
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("아무거나 입력! : ");
		//1. try~catch문 : 여기서 이 자리에서 곧바로 에러 처리하겠다.
		  //try{} : 예외가 발생할 가능성이 있는 코드 작성
		  //catch(발생될 예외 클래스 e){} : try구문 내에서 예외 발생시 어떻게 처리 할 것인지의 구문
		
		/*
		//String str = br.readLine();
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("예외처리할것");
		}
		*/
		
		//2. throws : 지금 이 자리에서 처리하지 않고, 현재 메서드를 호출하는 곳으로 예외처리 넘기겠다.(위임)
		String str = br.readLine();
		
	}
	
	
}
