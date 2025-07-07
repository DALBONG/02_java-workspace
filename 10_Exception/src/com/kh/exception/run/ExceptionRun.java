package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_checkedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {//끝까지 떠넘기면 JVM이 알아서 처리하나, 권장X
		/*
		에러 종류
		 - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 스스로 해결 안됨(심각한 에러)
		 - 컴파일 에러 : 소스코드 문법상 오류 => 빨간줄로 애초에 오류로 알려줌 (개발자 실수)
		 - 런타임 에러 : 코드 상으로는 문제가 없는데 프로그램 실행중에 발생하는 에러 (개발자 및 사용자 실수)
		 	=> 예외 처리 (실수가 안난것 처럼)
		 - 논리 에러 : 문법적으로도, 실행했을때도 문제는 없지만 프로그램 의도상 맞지 않는 것
		 
		 시스템 에러를 제외한 컴파일, 런타임, 논리 에러와 같은 비교적 덜 심각한 것들을 예외Exception이라 함.
		 '예외 발생할 경우 처리' 방법 (예외 처리)
		 
		 1. 예외처리 목적
		  - 예외처리를 하지 않고 그대로 예외가 발생하는 경우 프로그램이 비정상 종료될 수 있음.
		  
		 2. 예외처리 방법
		  1) try~catch 문 이용
		  2) throws를 이용 (떠넘기기 == 위임하기)
		  +3) try~with~resource
		*/
		
		A_UncheckedException a = new A_UncheckedException();
//		a.method1();
//		a.method2();
//		a.method3();
		B_checkedException b = new B_checkedException();
		b.method1();
//		b.method2();
		
		
		
		
		
	}

}
