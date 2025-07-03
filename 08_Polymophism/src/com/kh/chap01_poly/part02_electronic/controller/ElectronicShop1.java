package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicShop1 {
	// == 용산 전자상가의 가게
	// 3개의 제품을 진열할 자리부터 만들자(데탑,놋북,태블릿)
	
	//private int price; // 기본 자료형
	private Desktop desk; // 내가 만든 자료형으로 만든 자리.
	private NoteBook note;
	private Tablet tab;
		// -> 자리만 마련했을 뿐, 객체 생성 된 것 X
	
	//Desktop 객체를 받아줄 수 있는 메소드
	public void insert(Desktop d) {
		desk = d;
	}
	//NoteBook 객체를 받아줄 수 있는 메소드
	public void insert(NoteBook n) {
		note = n;
	}
	//Tablet 객체를 받아줄 수 있는 메소드
	public void insert(Tablet t) {
		tab = t;
	}
	
		// 동일한 클래스에 동일한 메소드명으로 여러개 만들어져 있는 것 : 오버로딩
		// -> 매개변수는 달라야 함(종류 , 갯수, 순서 등..)
	
	//조회용 메소드
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	
	
	
	
	
	
}
