package com.kh.chap02_String.controller;

public class B_StringMethodTest {
	
	public void method3() {
		
		String str1= "Hello World";
		
		//메소드명 (매개변수) : 반환형
		
		// 1.문자열.charAt(int index) : char
			// '문자열'에서 절달받은 인덱스 위치의 문자 반환
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.cuncat(String str) : String
			// 문자열을 합쳐, 새로운 문자열로 반환
		String str2 = str1.concat("!!wow");
		System.out.println("str2 : "+str2);
		
		String str3 = str1 + "!!wow";
		System.out.println("str3 : "+str3);
		System.out.println(str2 == str3);
			/* 이건 왜 또 달라? 
			   concat 열어보면 안에 new키워드가 있어, heap에 새로운 주소값으로 따짐.*/
		
		// 3. 문자열.equals(Object obj) : boolean
			// 문자열과 전달된 또다른 문자열을 가지고 주소값 비교가 아닌, 문자열로 동등비교.
		System.out.println("str2와 str3가 일치하냐? : " + str2.equals(str3));
		
		// 4. 문자열.contains(CharSequence s) : boolean
			// 문자열이 포함되어있는가?
		System.out.println("str1에 Hello 문자열이 포함되어 있나? : " + str1.contains("Hello"));
		System.out.println("str1에 hello 문자열이 포함되어 있나? : " + str1.contains("hello"));
		
		// 5. 문자열.length() : int
		System.out.println("str1의 길이 : " + str1.length());
		
		// 6. 문자열.substring (int beginIndex) : String
		  	// 문자열.substring(int beginIndex, int endIndex) : String
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
			/*
		 	1. str1 -> Worl만 추출 + concat()!를 붙여서 -> str0 = Worl!
		 	2. contains 함수를 이용해서 !가 포함되어있는 여부 추출 -> str0에 !가 포함되어있나? true 
			 */
		String str99 = str1.substring(6, 10);
		String str0 = str99.concat("!");
		System.out.println(str0);
		System.out.println("str0에 ! 포함? : " + str0.contains("!"));
		
		// 7. 문자열.replace(char oldChar, char newChar) : String
		
		// 8. 문자열.toUpperCase() : String   / toLowerCase() : String
		String str5 = str1.toUpperCase();
		System.out.println(str5.toLowerCase());
				/*
				  sysout("계속 하시겠습니까? (y/n):");
				  char ch sc.nextLine().toUpperCase().charAt(0) -> 가능
				  char ch sc.nextLine().charAt(0).toUpperCase() -> 불가
				*/
		
		// 9. 문자열.trim() : String
		  	// 문자열의 앞 뒤 공백을 제거시킨 새로운 문자열 반환.
		String str6 = "     JA      VA        ";
		System.out.println(str6.trim());
		
		// 10. 문자열.toCharArray() : char
		char[] arr = str1.toCharArray();
		System.out.println(arr[7]);
			
		// 11. String.valueOfchar[] data) : String
		System.out.println(String.valueOf(arr));
		
	}
	
	
	
}
