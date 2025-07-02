package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		/*
		 조건식으로 i<=배열의 길이라고 제시되어 있음.
		 */
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		
	}

}
