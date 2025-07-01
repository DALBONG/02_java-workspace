package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

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
		
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i].information());
		}
		
	}

}
