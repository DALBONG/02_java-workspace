package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizer {
	
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
			//구분자를 기준으로 문자열 분리
		
		// 방법1. 분리된 문자열을 String[]배열에 담을 때,
		  	// String 클래스의 split 메소드 이용
		 	// 문자열. split(구분자) : String
		
		String[] arr = str.split(",");
		System.out.println("arr배열의 길이: " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}*/
		
		//향상된 for문
		int count = 0;
		for(String a : arr) {
			System.out.println(count + "번째 인덱스 :" + a);
			count++;
		}
		
		// 방법2. 분리된 문자열을 각각의 토큰으로 관리 
		  // java.util.StringTokenizer 클래스 이용.
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println( "분리된 문자열 개수 : " + stn.countTokens());
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		*/
		
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
			
			! 왜3개만 출력?!
			i=0 i<6 -> 출력 JAVA
			i=1 i<5 -> 출력 Oracle
			i=2 i<4 -> 출력 JDBC
			i=3 i<3 -> false 반복문 끝.
		}*/
		
		// 해결방법1.
		/*
		int count1 = stn.countTokens(); // 카운트 토큰을 고정시켜놓기.
		for(int i=0; i<count1; i++) {
			System.out.println(stn.nextToken());
		}*/
		
		//해결방법2.
		while(stn.hasMoreTokens()){
			System.out.println(stn.nextToken());
		}
		
		
		
	}

}
