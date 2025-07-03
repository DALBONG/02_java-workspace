package com.kh.chap05_constructor.model.vo;

public class User {

	private String userId;
	private String userPwd;
	private String userName;
	private int userAge;
	private char gender;
	
	/*
	 	생성자 
	 	[표현법]
	 	public 클래스명([매개변수,..]){
	 	
	 	} 
	 	
	 	생성자를 작성하는 목적
	 	- 객체를 생성해주기 위한 목적.
	 	
	 	*생성자 작성시 유의사항.
	 	 - 반드시 생성자 명은 클래스명과 동일해야 함(대소문자도 맞춰야 함)
	 	 - 반환형이 존재하지 않음. 
	 	 - 매개변수 생상자를 명시적으로 작성시, 기본생성자를 JVM이 자동으로 만들어주지 않음.
	 	   => 기본생성자를 항상 작성하는 습관 들이기.
	*/
	
	//기본생성자
	public User() {}
	
	//매개변수 생성자
	public User(String userId, String userPwd, String userName) {
		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		
		
	}
	
	public User(String userId, String userPwd, String userName, int userAge, char gender) {
		
		this(userId, userPwd, userName);
		/*
		 위와 같이 중복되는 동일한 내용의 생성자가 있을 경우
		 this() 생성자 활용 가능. 
		 => 같은 클래스 내에 생상자에서 또 다른 생성자 호출가능
		 	(유의사항 : 반드시 첫 줄에 작성해야 함)
		*/
		this.userAge = userAge;
		this.gender = gender;
		
		
		
	}
	
	
	
	
	//getter후 sertter
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public char getUserGender() {
		return gender;
	}
	public void setUserGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "userId:" + userId + ",userPwd:"  + userPwd + ",userName:" + userName + "userAge:" + userAge + ",gender:" + gender;
	}

}
