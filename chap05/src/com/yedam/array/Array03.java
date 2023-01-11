package com.yedam.array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열
		int[] ary;
		//배열의 크기(인덱스 갯수)
		int no;
		
		System.out.println("배열의 크기>");
		no = Integer.parseInt(sc.nextLine());
		
		ary = new int[no];
		
		System.out.println(ary.length);
		
		for(int i=0;i<ary.length;i++) {
			System.out.println("입력>");
			ary[i] = Integer.parseInt(sc.nextLine()); 
		}
		
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);		
		}
		
		//최댓값,최솟값 구하기
		int max = 0;
		for(int i=0;i<ary.length;i++) {
			if(i==0 || max<ary[i]) {
				max = ary[i];
			}
		}
		
		int min = ary[0];
		for(int i=0;i<ary.length;i++) {   
			if(min>ary[i]) {      
				min = ary[i];
			}
		}
		
		System.out.println("최댓값:"+max+"최솟값:"+min);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
