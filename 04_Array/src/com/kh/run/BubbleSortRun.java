package com.kh.run;

public class BubbleSortRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//버블 정렬 (면접 코딩테스트때 나올 수 있음)
		int[] arr = {22, 30, 64, 2, 24, 83, 98};
		int temp = 0; //바로 자리를 바꾸지 못함, 임시로 있을 박스가 있어야 함 = temp 
		
		for(int i=0; i<arr.length; i++) { // 전체 사이클 for문
			for(int j=1; j<arr.length; j++) { //배열 안에서 돌아갈 for문
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;  //! 
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
