package com.yedam.loop;

public class LoopCondition {
	public static void main(String[] args) {
		//while break;
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(i+j==5) {
					System.out.println("i+j="+(i+j));
					break; //얘를 품은 for문 하나만 종료
				} else {
					System.out.println(j);
				}
			}
		}
		
		//for문 label break;
		
		Outter : for(char upper = 'A'; upper <='z'; upper++) {
			for(char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-"+lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		
		//continue
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				continue; //아래로 안가고 다시 위로 올라감
			}
			System.out.println(i);
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
