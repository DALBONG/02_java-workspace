package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {
		/*
		 1) Network : 여러대 컴퓨터들이 연결되어있는 통신망
		 		 -> 네트워크를 통해 서로간의 데이터 교환 가능.
		 2) IP주소 : 네트워크 상에 각 컴퓨터들을 식별해줄 수 있는 번호 
		 3) 서버와 클라이언트
		   - 서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램(클라이언트의 요청을 처리, 응답)
		   - 클라이언트 : 서버에 요청하는 컴퓨터 (서비스를 제공받는 고객)
		   >> 서버에 요청하기 위해서, 그 요청하고자 하는 서버의 IP주소, port번호 알아야 함
		*/
		
		
		// InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost); // 내 Pc명 / ip주소 확인
			System.out.println("내 PC명 : " + localHost.getHostName());
			System.out.println("내 IP만 : " + localHost.getHostAddress());
			
			System.out.println("======================================");
			
			//내가 알고있는 도메인 명을 통해, 서버 관련 정보 얻기
			InetAddress googleHost = InetAddress.getByName("www.google.com");
				// -> 도메인 명을 통해 해당 호스트 정보 반환
			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 ip주소 : " + googleHost.getHostAddress());
			System.out.println("===========================================");
			
			//도메인을 통해 서버 관련한 것들을 배열로 받을 수 있음
			InetAddress[] naverHost = InetAddress.getAllByName("www.netflix.com");
			
			System.out.println("네이버 호스트 개수 : " + naverHost.length);
			for(InetAddress n: naverHost){ //자료형 변수 : 
				System.out.println("네이버 서버명 : " + n.getHostName());
				System.out.println("네이버 IP주소 : " + n.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		 현재 구동중인 서버가 있으면 클라이언트는 그 서버로 요청을 보낼 수 있음
		 	 => 응답 결과가 돌아옴.
		 - 요청과 응답에 의해 프로그램이 돌아감. (통신 한다.)
		 - 웹에서의 통신 방식 : HTTP 프로토콜 통신
		 
		 * 자바만을 가지고 서버와 클라이언트 간에 간단한 통신 해보기.
		   이 떄 데이터를 입출력하고자 한다면, 서버 - 클라이언트 간의 스트림 필요
		   
		 * 소켓 : 프로세스간의 통신을 담당하는 것.(스트림을 연결하기 위한 문)
		  
		   소켓 프로그래밍 : TCP방식 / UDP 방식
		   - TCP 방식 : 데이터 전송 속도 느리나, 데이터를 정확하고 안정적으로 전달 가능 (티키타카)
		   			-> 신뢰성이 요구되는 프로그램 (은행어플)
		   - UDP 방식 : 데이터 전송 속도 빠르지만, 신뢰성이 없는 데이터 전달될 수 있음
		   			-> ex.실시간 중계
		 
		*/
		
		
		
		
	}

}
