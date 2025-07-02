package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 객체 배열을 크기 3으로 할당 한 뒤
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력

		Employee[] ep = new Employee[3];
		
		ep[0] = new Employee();
		ep[1] = new Employee(1, "김달봉", 23, 'M', "010-4873-5858", "경기 특별시");
		ep[2] = new Employee(2, "박봉달", "산책부", "과장", 27, 'F', 2500000, 0.8, "060-700-8847", "경기 울산시");
		
		for(int i=0; i<ep.length; i++) {
			System.out.println(ep[i].information());
		}
		
		System.out.println("===================================================");
	
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
		
		ep[0] = new Employee(3, "고끼리", "영업부","말단",30,'M',2100000,0.02,"070-2873-4546","서울 환천길");
		ep[1].setDept("유부");
		ep[1].setJob("팀장");
		ep[1].setSalary(2300000);
		ep[1].setBonusPoint(0.06);
		
		
		for(int i=0; i<ep.length; i++) {
			System.out.println(ep[i].information());
		}
		
		System.out.println("===================================================");
		
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12
		
		/*
		System.out.println("고끼리의 연봉 :" + (int)(ep[0].getSalary()+(ep[0].getSalary()*ep[0].getBonusPoint()))*12 + "원");
		System.out.println("김달봉의 연봉 :" + (int)(ep[1].getSalary()+(ep[1].getSalary()*ep[1].getBonusPoint()))*12 + "원");
		System.out.println("박봉달의 연봉 :" + (int)(ep[2].getSalary()+(ep[2].getSalary()*ep[2].getBonusPoint()))*12 + "원");
		*/
		
		int total = 0;
		for(int i=0; i<ep.length; i++) {
			total += (int)(ep[i].getSalary()+(ep[i].getSalary()*ep[i].getBonusPoint()))*12;
			System.out.println(ep[i].getEmpName()+"의 연봉 : "+((int)(ep[i].getSalary()+(ep[i].getSalary()*ep[i].getBonusPoint()))*12)+"원");
		}
				
		System.out.println("=====================================================");
		
		System.out.println("직원들 연봉의 평균 :" + (total/ep.length) + "원");

		
		

		// 3명 직원의 연봉 평균을 구하여 출력
		
		
	}

}
