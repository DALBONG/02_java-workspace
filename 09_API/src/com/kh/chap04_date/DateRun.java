package com.kh.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		/*
		 java.util.Date
		*/
		
		// 기본 생성자를 통해 생성
		Date date1 = new Date();
		System.out.println(date1);
		 
		//내가 원하는 날짜로 생성(25.6.9)
		// 1) 매개변수 생성자를 통해서 생성
		Date date2 = new Date(2025-1900, 6-1, 9);
		System.out.println(date2); // 년도에 1900이 더해지게 해놨음.
		
		// 2) 기본생성자 생성 후 setter메소드로 값 변경
		date1.setMonth(6-1);
		date1.setDate(9);
		System.out.println(date1);
		
		//2025년 6월 9일 10시 40분 12초
		 //내 입맛대로 포맷을 적용해서 출력하게 해주는 클래스 이용.
		 // java.text.SimpleDateFormat 클래스
		
		// 1. sdf라는 객체 생성 (원하는 포맷을 매개변수로 전달)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// 2. sdf의 메소드 호출
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
	}

}
