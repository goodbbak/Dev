package com.yedam.array;

import java.util.Scanner;

public class StudentArray {
	public static void main(String[] args) {
		//한 학생의 성적을 입력.
		//과목수
		int subjectNum =0; //과목수
		int[] score = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("========================================");
			System.out.println("1.과목수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("========================================");
			System.out.println("메뉴입력>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo ==1) {
				System.out.println("과목수를 입력하세요>");
				subjectNum = Integer.parseInt(sc.nextLine());
				//score = new int[subjectNum]; 여기서 배열의 크기 정하면 못 바꿈
				
			} else if(selectNo ==2) {	
				score = new int[subjectNum];
				for(int i=0;i<score.length;i++) {
					System.out.println((i+1)+"번째과목점수>");
					score[i] = Integer.parseInt(sc.nextLine());
				}
			} else if(selectNo ==3) {
				for(int i=0;i<score.length;i++) {
					System.out.println(score[i]);
				}
			} else if(selectNo ==4) {
				int sum =0;
				for(int i=0;i<score.length;i++) {
					sum += score[i];				
				}System.out.println("총점:"+sum);
				System.out.println("평균:"+(double)sum/score.length);
			} else if(selectNo ==5) {
				System.out.println("end of prog");
				break;
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	
