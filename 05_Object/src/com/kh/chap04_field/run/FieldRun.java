package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		FieldTest1 f1 = new FieldTest1();
		//f1.test1(7);
		
		
		FieldTest2 f2 = new FieldTest2();
		//public
		//System.out.println(f2.pub);
		//protected
			//System.out.println(f2.pro); 다른 패키지에 있어 접근X
		//default
			//System.out.println(f2.def);
		//private
			//System.out.println(f2.pir);
		
		
		/*
		FieldTest3 f3 = new FieldTest3();
		System.out.println(f3.sta);
		객체 생성하지 않고도 호출 가능.
		*/
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest3.STA_FIN);
		System.out.println(Math.PI); 
		
	}

}
