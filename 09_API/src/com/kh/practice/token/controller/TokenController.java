package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	
	
	public String afterToken(String str) { 
		  // 매개변수로 받아온 str을 StringTokenizer를 이용하여 
		  // 띄어쓰기를 없애고 없앤 문자열 반환
		
		String aaa = str.replace(" ", "");
		 
		return aaa;
		
	}
	
	
	
	
	
	
	
}
