package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		// == 납품 업체라고 생각.
		
		// 1. 다형성 적용 X
		/*
		ElectronicShop1 es = new ElectronicShop1();
		
		es.insert(new Desktop("samsung", "데탑", 1200000, "gtx1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("apppple", "ipad", 800000, false));
		
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 2. 다형성 적용 O
		ElectronicShop2 es = new ElectronicShop2();
		es.insert(new Desktop("삼성", "데탑", 1299990, "gtx30"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("appple", "아이패드", 800000, false));
		
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		//toString()할 때 부모에 있는 toString()을 실행할 것 처럼 보이지만
			// 실제로는 자식 객체의 toString()이 실행. -> 동적 바인딩.
		
		
	}

}
