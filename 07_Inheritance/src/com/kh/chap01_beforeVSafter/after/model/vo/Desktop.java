package com.kh.chap01_beforeVSafter.after.model.vo;


// 			 자식(Desktop) ->  부모(Product) 
// 		   	   하위	    ->      상위
// 		   	   후손	    ->      조상
public class Desktop extends Product {
					 // 상속한다(extends) Product 클래스 파일을.

	
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		//this.brand = brand; --> (brand~ price는 상속은 받았으나, 부모것임. private로 외부에서x)
			//그럼, super. 으로 부모에 접근해봐..? 
			//super.brand = brand; --> 불가.
		//해결법 1. 부모 클래스(Product)의 필드의 접근제한자를 protected로 변경
		//해결법 2. 부모클래스의 setter 메소드 활용
			/*
			super.setBrand(brand);
			super.setpCode(pCode);
			super.setpName(pName);
			super.setPrice(price);
			*/
		//해결법 3. 부모 생성자 호출하기.
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
		
		public boolean getAllInOne(){
			return allInOne;
		}
		
		public void setAllInOne(boolean allInOne) {
			this.allInOne = allInOne;
		}
		
		//오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재 정의 하는 것
		public String information() {
			return super.information() + ", allInOne :" + allInOne;
		}
		
		
		
		
	}
	
}
