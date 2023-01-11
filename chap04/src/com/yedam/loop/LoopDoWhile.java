package com.yedam.loop;

import java.util.Scanner;

public class LoopDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.println("올바른 월을 입력[1~12]"); //do안의{}먼저 실행후 while의 조건과 비교해서 true면 또 {}실행 false면 탈출
			month = sc.nextInt();
		}while(month<1||month>12);
		System.out.println("사용자가 입력한 월은"+month);
		
		
		
		
		
		
		
		
	}
}
