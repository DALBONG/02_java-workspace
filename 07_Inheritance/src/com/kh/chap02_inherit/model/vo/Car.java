package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{
	
	private int tire;
	
	public Car() {}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	@Override
	public String information() {
		return super.information() + "tire :" + tire;
	}

	@Override	/*(오버라이딩 한거야 알려주는 것) ->  @:어노테이션*/
	//부모 메소드와 다르게 (오버라이딩)
	public void howToMove() {
		System.out.println("바퀴를 굴려 움직인다");
	}
	
	
	//++ toString
	@Override
	public String toString() {
		return super.information() + "tire :" + tire;
	}
	
	
}
