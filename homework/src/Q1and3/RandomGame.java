package Q1and3;

import java.util.Scanner;

public class RandomGame  {
	Scanner sc = new Scanner(System.in);
	//필드
	int gameNo;
	
	//생성자
	public RandomGame() {
		menu();
		gameNo = (int)(Math.random())*2;
		if(gameNo == 0) {
			System.out.println("PRGgame 실행");
		} else {
			System.out.println("ArcadeGame 실행");
		}
		
		
		
		
		
	}
	
	//메소드
	public void menu() {
		System.out.println("============================================================================================");
		System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
		System.out.println("============================================================================================");
	}
	
	
	
	
	
	
	
	
	
}
