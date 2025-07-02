package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용 데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력
		
		Student[] s = new Student[3];
		s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과"); 
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].toString());
		}
		
		Employee[] e = new Employee[10];	
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		while (i < e.length) {
			System.out.print((i+1) + "번째 직원 정보 입력");
			sc.nextLine();
			
			if(e.equals("n")) {
				break;
			}
			
			System.out.print("이름:");
			String name = sc.nextLine();
			
			System.out.print("나이:");
			int age = sc.nextInt();
			
			System.out.print("키");
			double height = sc.nextDouble();
			
			System.out.print("몸무게");
			double weight = sc.nextDouble();
			
			System.out.print("급여");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("부서");
			String dept = sc.nextLine();
			
		}
		
		System.out.println();
		for(Employee emp:e) {
			System.out.println(emp);
			
		}
				
		

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체 배열에 객체 생성
		// 한명씩 추가 될때마다 카운트함

		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 y이면 계속 객체 추가
		// ‘n’일 경우 더 이상 그만 입력 받도록 …

		// 배열에 담긴 사원들의 정보를 모두 출력
	
		
		
	}

}
