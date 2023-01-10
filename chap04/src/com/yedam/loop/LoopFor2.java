package com.yedam.loop;

public class LoopFor2 {
	public static void main(String[] args) {
		//중첩 for문
		//2단~9단 출력
		for(int i =2; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		//별찍기 첫번째 for문은 줄넘김 두번째 for문은 그 줄에서의 반복
		//*****
		//*****
		//*****
		//한줄 내려갈때 쓴느 반복문
		for(int i=1;i<=5;i++) {
			//별을 찍어주는 반복문
			for(int j = 1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println(); //줄넘김용
		}
		//*
		//**
		//***
		for(int i=1;i<=5;i++) {
			//별을 찍어주는 반복문
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//**
		//*
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
