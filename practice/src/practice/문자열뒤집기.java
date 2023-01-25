package practice;

import java.util.Scanner;

public class 문자열뒤집기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		String[] answer = sc.nextLine().split("");		
//		
//		for(int i = answer.length-1;i>=0;i--) {
//			System.out.println(answer[i]);
//		}
//		
		
		
		//String.charAt(위치); -> 위치에 따른 문자 출력
		String answer = sc.nextLine();
		
		for(int i = answer.length()-1;i>=0;i--) {
			System.out.print(answer.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
