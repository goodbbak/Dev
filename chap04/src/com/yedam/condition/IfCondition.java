package com.yedam.condition;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90이상이고,등급A");
		}
		//실행문이 한 줄 일때만 {}생략
		if(score>=90)
			System.out.println("점수가 90이상이고,등급A");
			System.out.println("스코어가 90"); //얘는 if문 적용 x
		
		//if-else
		if(score>=90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		//else - if
		//if문 (조건식을 여러 개 사용 할 때)
		score = 70;
		if(score >= 90) {
			System.out.println("등급A");			
		}else if(score>=80) {
			System.out.println("등급B");
		}else if(score>=70) {
			System.out.println("등급C");
		}else {
			System.out.println("등급D");
		}
		
		//random값 추출
		//Random() / Math.random()
		//범위 0 <= Math.random() < 1 => 0~0.999--
		System.out.println(Math.random());
		//0*10 <= Math.random()*10 < 1*10
		//int number = (int)5.12
		
		//0~9.99-- => 0~9
		//(int)0 <= (int)Math.random() *10 < (int)10
		
		//0~9 => 1~10
		//(int)0+1 <= (int)Math.random() *10+1 < (int)10+1
		
		//주사위의 번호 뽑기   //0<=x<1 == 0~0.999
						   // 6곱해주고 (int)로 정수 만들어주고 +1
		int number = (int)(Math.random()*6) + 1; //1~6사이 나옴
		
		if(number == 1) {
			System.out.println("1번 나옴");
		} else if(number == 2) {
			System.out.println("2번 나옴");
		} else if(number == 3) {
			System.out.println("3번 나옴");
		} else if(number == 4) {
			System.out.println("4번 나옴");
		} else if(number == 5) {
			System.out.println("5번 나옴");
		} else if(number == 6) {
			System.out.println("6번 나옴");
		}
		
		
		
		
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("점수입력>");
		
		score = Integer.parseInt(sc.nextLine());
		String grade = "";
		if(score >= 90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}
		
		System.out.println("획득한 점수 :"+grade);
		
		
		
		
		
		
		
		
		
		
		
		
			
			
	}
}
