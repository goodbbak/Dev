package com.yedam.exam01;

public class exam03 {
	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		coinUnit[0] = 500;
		coinUnit[1] = 100;
		coinUnit[2] = 50;
		coinUnit[3] = 10;
		int money = 2680;		
		for(int i=0;i<coinUnit.length;i++) {		
				int a = money/coinUnit[i];
				money -= a*coinUnit[i];	
				System.out.println(coinUnit[i]+"원:"+a+"개");
		}
		
	}
}
