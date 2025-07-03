package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicShop2 {
	// 다형성 개념 적용.
	
	//용산 전자상가 오픈
	// 3개의 제품을 전시할 자리 마련
	
	//다형성 : 부모타입 레퍼런스로 다양한 자식 객체를 만들 수 있음.
	
	// 부모 : Electronic
	// 자식 : Desktop, NoteBook, Tablet
	
	//아까 했던 것 : parent[] arr = new Parent[4];
	 // arr[0] = new Child1();
	 // arr[1] = new Child2();
	
	Electronic[] elec = new Electronic[3];
	int count = 0; 
	
	//insert 함수 구현
	public void insert(Electronic any) {
		elec[count++] = any; // elec[0]:데탑 -> elec[1]:놋북
		
	}
	
	
	//조회용 
	public Electronic select(int index) {
		return elec[index];
		
	}
	 
	
	
}
