package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	
	
	public String afterToken(String str) { 
		  // 매개변수로 받아온 str을 StringTokenizer를 이용하여 
		  // 띄어쓰기를 없애고 없앤 문자열 반환
		
		String at = str.replace(" ", "");
		 
		return at;
		
	}
	
	public String firstCap(String input) {
		  // 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환 

		//System.out.println(input);
		int li = input.length(); 
		System.out.println("첫 글자 대문자 : " + input.substring(0,1).toUpperCase() + input.substring(1, li));
		
		return "";
		
	}
	
	
	
	
	
	
	
}
