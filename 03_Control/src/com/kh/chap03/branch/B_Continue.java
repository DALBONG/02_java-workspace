package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	/*
	  continue; : 반복문 안에 기술되는 구문으로
	  		실행시 뒤의 구문은 실해앟지 않고 현재 속해있는 반복문
	 */
	
	public void method1() {
			//for문으로 1~10까지의 홀수 출력
		for(int i=1; i<11; i++) {
			if(i % 2 == 0) {
				continue; // 짝수일 경우 건너뛸꺼야
			}
			System.out.print(i + " ");
			/*
			 for문 실행 후, 짝수일 경우, continue를 만나 
			 아래 코드(sysout)를 실행하지 않고, 다음 명령 수행.
			*/
					/* Tip
				 	코드 틀어졌을 때 구간 드래그 후 ctrl + shift + F
						ㄴ같이 프로젝트 할 때, 다른 人것이 틀어졌다 해서 정렬X
				 	alt 누르고 방향키(위,아래) : 코드 이동
				 	ctrl + shift + r : 파일명으로 검색
				 	ctrl + h : 키워드로 파일 찾기
					*/
		}
	}
	
	
	
	public void method2() {
			// 2~9단 출력(for문 중첩), 단 3의 배수단은 빼고 출력
		
		for(int dan=2; dan<10; dan++) {
			if(dan % 3 == 0) {
				continue; // 아래코드 실행x 증감만 수행
			}
			for(int i=1; i<10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i );
			}
		}
	}
	
	
	public void method3() {
		// 13까지 숫자에서 짝수는 출력x
		for(int i=0; i<=13; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);

		}

		
	}
	
	
	
	
	
	
	
}
