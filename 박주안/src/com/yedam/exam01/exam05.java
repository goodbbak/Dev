package com.yedam.exam01;

import java.util.Scanner;

public class exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		//int num;   //어떨때 그냥 선언만하고 어떨때 int num = 0;하는지
		int diceVolume = 0; //얘들 왜 밖에 꺼내두는지 case1끝나고 while문 안에만 있으면 유지되는거아님?		
		int[] diceNums = null;
		while(run) {
			System.out.println("===1.주사위크기 2.주사위굴리기 3.결과보기 4.가장많이나온 수 5.종료===\n메뉴>");
			int num = Integer.parseInt(sc.nextLine());//어떨때 그냥 선언만하고 어떨때 int num = 0;하는지		
			switch(num) {			
			case 1: System.out.println("주사위크기>");				
				diceVolume = Integer.parseInt(sc.nextLine());
				if(5<=diceVolume && diceVolume<=10) {
					System.out.println(diceVolume);				
				} else {
					System.out.println("5~10사이입력");
					diceVolume = 0; //요걸 몰랐네..
				}				  
				  break;
			case 2:int count = 0;
				diceNums = new int[diceVolume];
				boolean shoot = true;
				while(shoot) {
					int diceNum = (int)(Math.random()*diceVolume)+1;
					System.out.println(diceNum);
					diceNums[diceNum-1]++;
					count ++;
					if(diceNum == 5) {
						shoot = false;
					}
				} System.out.println("5가 나올때까지"+count+"번돌림");
				
				break;
			case 3://각 숫자들 몇번 나왔는지
				for(int i=0;i<diceNums.length;i++) {
					System.out.println(i+1+"이"+diceNums[i]+"번나옴");
				}
				break;
			case 4:// 가장 많이 나온수 출력
				int max = diceNums[0];
				int index = 0;
				for(int i=0;i<diceNums.length;i++) {
					if(max <diceNums[i]) {
						max = diceNums[1];
						index = i;
					}
				} System.out.println("가장많이 나온 숫자는"+(index+1)+"이"+max+"번나옴");
				break;
			case 5:System.out.println("종료됨");
				run = false;
				break;
			
	
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
