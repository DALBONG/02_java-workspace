package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;
import java.util.Scanner;

import com.kh.chap01.oneVSmany.model.vo.Book;


public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Phone[] phones = new Phone[3];
		//phones[0].setName("아이폰"); -> X : 아직은 phone생성 전으로, null값이기에 오류남
		
		//기본생성자
		phones[0] = new Phone(); // -> 이제, Phone의 filed가 생기는 것
		phones[0].setName("무슨폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("샘송");
		
		//매개변수 생성자로 객체 생성 및 초기화
		phones[1] = new Phone("아이폰", "애플", 1300000, "16pro");
		phones[2] = new Phone("갤럭시", "삼성", 1299999, "zzzzz플립");
		
		
		//휴대폰의 총 가격과 평균가 구하기(누적합)
		int total = 0; //평균가 구하기 1.
		for(int i=0; i<phones.length; i++) {
			total += phones[i].getPrice(); // 평균가 구하기 2.
			System.out.println(phones[i].information());
		}
		System.out.println("총 가격: " + total + "원"); //평균가 구하기 3.합계 출력
		System.out.println("평균가 : " + total/phones.length + "원"); //평균가 구하기 4. 평균가 출력
		
		//사용자에게 구매하고자 하는 핸드폰 명 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하고자 하는 핸드폰 :");
		String buy = sc.nextLine();
		
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 폰의 가격은 : " + phones[i].getPrice());
			}
		}
		
		
	}

}
