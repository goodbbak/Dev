package com.yedam.condition;

import java.util.Scanner;

public class SwitchCondition {
	public static void main(String[] args) {
		int number = (int)(Math.random()*6) + 1;
		System.out.println(number);
		
		switch(number) {
		case 1: 
			System.out.println("1번 나옴");
			break; //break되면 switch 탈출  break 없으면 밑에까지 실행
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		default:
			System.out.println("6번 나옴");
			break;
		}
		
		//char 
		
		char grade = 'B';
		
		switch(grade) {
		case 'A': //case의 값은 int char String 뭐든 올 수 있음
			System.out.println("우수회원");
		case 'B':
			System.out.println("일반회원");
			break; 
		default:
			System.out.println("손님");
		}
		
		//입력한 성적을 등급으로 환산
		Scanner sc =  new Scanner(System.in);
		//99~90 : A
		//89~80 : B
		//79~70 : C
		//70아래 : D
		System.out.println("입력>");
		int scores = Integer.parseInt(sc.nextLine())/10;
		switch (scores) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		default:
			System.out.println("D등급");
			break;
		}
		
		//정첩 if문
		//data -> 조건 여러 번 검색
		//if(조건식) {
			//if(조건식) {
				//if(조건식) {
					
				//}
			//}
		//}
		
		int no = 10;
		//no가 2의배수
		if(no % 2 == 0) {
			//no가 5의배수
			if(no % 5 == 0) {
				//no가 10의배수
				if(no % 10 == 0) {
					System.out.println("no는10의 배수입니다.");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
