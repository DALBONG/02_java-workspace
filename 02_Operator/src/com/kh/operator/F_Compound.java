package com.kh.operator;

public class F_Compound {
	/*
	  *복합 대입 연산자
	   - 산술 연산자와 대입 연산자가 결합되어 있는 형태 (산술연산 먼저 씀)
	   - 연산 처리 속도가 빨라지므로 "사용 권장"함
	     += -= *= /= %=
	    EX) a = a + 3  -->  a += 3
	        a = a - 3  -->  a -= 3 ... 
	 */

	public void method1() {
		int num = 12;
		System.out.println("최초num" + num);
		num = num + 3; 
		System.out.println("3증가num" + num);
		
		num += 3;
		System.out.println("3증가num" + num);
		num -= 5;
		System.out.println("5감소num" + num);
		num *= 6;
		System.out.println("6배num" + num);
		num /= 2;
		System.out.println("2나눈num" + num);
		num %= 4;
		System.out.println("최종num" + num);
		
		//누적
		String str = "Hello";
		str = str + "World!";
		System.out.println(str);
		str += "Worlds!";
		
		
		
	}
}
