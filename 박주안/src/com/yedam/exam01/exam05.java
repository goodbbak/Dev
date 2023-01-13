package com.yedam.exam01;

import java.util.Scanner;

public class exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("===1.주사위크기 2.주사위굴리기 3.결과보기 4.가장많이나온 수 5.종료===\n메뉴>");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1: System.out.println("주사위크기>");				
				int diceVolume = Integer.parseInt(sc.nextLine());
				if(5<=diceVolume && diceVolume<=10) {
					break;
				} else System.out.println("5~10사이입력");			
			case 2: 
				int diceNum = 0; 			
				int i=0;
				int[] diceNums = null;
				diceNums = new int[];
				while(diceNum == 5) {
					diceNum = (int)(Math.random()*5)+6;			
					i ++;
					diceNums[i] = diceNum;
					
				}
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			
	
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
