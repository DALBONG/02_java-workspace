package com.kh.chap02_abstractAndinterface.part01_easy.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
	public Sports(int people) {
		this.people = people;
	}
	
	
	public int getPeople() {//머리부
		return people; //몸통부 -> 없다면, 완벽한 메소드 아님.
	}
	public void setPeople(int people) {
		this.people = people;
	}
	
	public String toString() {
		return " "+ people;
	}
	
	
	//미완성된 메소드 (추상메소드)
	//public void rule(); -> 머리부만 있고, 몸통부가 없어 에러. 
	public abstract void rule(); //->클레스에도 abstract를 써줘야 함.
		// 미완성된 메소드가 있다는 것은 이 클래스도 미완성
		// 완성형은 언제? : 해당 추상클래스를 상속받는 자식에서 
	
	
	

}
