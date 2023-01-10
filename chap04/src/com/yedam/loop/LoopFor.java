package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {
	public static void main(String[] args) {
		//for문
	
		for(int i=0;i<=100;i++) {
		System.out.println(i);
		}

		//1부터 100까지의 합 구하기
		int result = 0;
		for(int i =1;i<=100;i++) {
			result += i;
		}
		System.out.println(result);
		
		//1~100사이의 짝수 구하기
		//짝수 성질 => 2로 나눴을 때 0으로 떨어지면 짝수
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				System.out.println(i+"는 짝수");
			} else if(!(i%2==0)) {
				System.out.println(i+"는 홀수");
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		//스캐너를 활용해서 값을 하나 입력
		//입력 받은 값에 대한 구구단 출력
		//ex)2를입력>2*1=2...2*9=18
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력>");
		int gugu = Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=9;i++) {
			System.out.println(gugu+"*"+i+"="+(gugu*i));
		}
		
		//입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 개수
		//스캐너 -> 데이터 입력
		//데이터 받을 개수 -> 5
		//데이터 입력 횟수가 5번이라는 뜻 1,5,50,40,9
		// 총합: 값을 입력 받을 때 마다 변수에 저장
		// 평균: 총합/갯수
		// 최댓값 : 입력 할 때마다 비교해서 최댓값인지 아닌지 확인
		// 최솟값 : 동일
		System.out.println("갯수 입력>");
		//입력할 데이터 갯수 입력 받음
		int datalength = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int aver = 0;
		int max = 0;
		int min = 0;
		
		for(int i =1; i<=datalength;i++) {
			int numbers = Integer.parseInt(sc.nextLine());		
			sum += numbers;
			if(i==0) {
				max = numbers;
				min = numbers;				
			}
			if(max<numbers) {
				max = numbers;
			}
			if(min>numbers) {
				min = numbers;
			
		}
		aver = sum/datalength;
		System.out.printf("평균 : %5.2f",(double)aver);  
		System.out.println("최댓값:"+sum+"최솟값:"+min);
		
		
		//2번 1~100 숫자 맞추기 up and down
		/*
		 * int randomNum = (int)(Math.random()*100) + 1; System.out.println("랜덤수맞추기>");
		 * int myNum = Integer.parseInt(sc.nextLine()); for(int i=1; i<=5;i++) {
		 * if(randomNum>myNum) { System.out.println("더 큰 수를 입력하세요"); } else
		 * if(randomNum<myNum) { System.out.println("더 작은 수를 입력하세요"); } else
		 * System.out.println("정답"); }
		 */
			int randomNo = (int)(Math.random()*100) + 1;
			 for(int i=0; i<5;i++) {
				 System.out.println("Up&Down>>");
				 int num = Integer.parseInt(sc.nextLine());
				 
				 if(randomNo == num) {
					 System.out.println("정답");
				 }else if (randomNo > num) {
					 System.out.println("더 큰 수 입력");
				 }else if (randomNo < num) {
					 System.out.println("더 작은 수 입력");
				 }
				 if(i==4) {
					 System.out.println("5번 기회 끝");
				 }
				 
			 }
		
		
		
	
	
	
	
		
	}
}