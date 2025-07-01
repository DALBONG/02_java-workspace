package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {

		User u1 = new User();
		System.out.println(u1.information());
		
		//각 필드에 JVM의 초기값이 담겨있음.
		u1.setUserId("user01");
		u1.setUserPwd("pwd01");
		u1.setUserName("김달봉");
		
		//2.매개변수 생성자로 객체 생성
		User u2 = new User("user02", "pwd02", "박달봉");
		System.out.println(u2.information());
		
		//3. 매개변수 전체 필드 넣어서 생성자로 객체 생성
		User u3 = new User("user03", "pwd03", "장달봉", 20, 'F');
		System.out.println(u3.information());
		
		//장달봉 -> 장봉달
		u3.setUserName("장봉달");
		System.out.println(u3.information());
		System.out.println(u3.getUserId());
		
		
	}

}
