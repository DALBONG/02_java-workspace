package com.kh.chap06_method.controller;

public class OverloadingTest {

	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것.
	
	public void method1() {
		System.out.println("아.. 집 가고싶..");
	}
	public void test() {
		System.out.println("아.. 집 가기싫...");
	}
	
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	/*
	public void test(int c, String d) {
		
	}
	오버로딩이 가능하려면, 매개변수 명이 아니라, 
	매개변수의 갯수나 순서가 다르게 작성되어야 함 
	*/
	
	public void test(String s, int a) {
		
	}
	
	public void test(String str) {
		
	}

	/*
	public int test(String str) {
		
	}
	반환형, 접근제한자 등.. 과도 상관 없음.
	반드시 매개변수의 갯수나 순서가!
	*/
	
	
	
	
	
	
	
}
