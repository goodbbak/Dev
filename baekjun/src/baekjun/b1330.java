package baekjun;

import java.util.Scanner;

public class b1330 {
	public static void main(String[] args) {
		//내 풀이, 나는 숫자 한번에 받는 줄 알았는데 따로 받아도 됐었음
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] newStr = input.split(" "); //split 메소드 복습
		int A = Integer.parseInt(newStr[0]);
		int B = Integer.parseInt(newStr[1]);

//		if (A > B) {
//			System.out.println(">");
//		} else if (A < B) {
//			System.out.println("<");
//		} else if (A == B) {
//			System.out.println("==");
//		}

		
		//인터넷에서 본 풀이 삼항연산자
		String result = (A>B) ? ">" : (A<B) ? "<" : "=="; //(조건식) true면 ?뒤로 false면 :뒤로 그리고 바로 값 말고 조건식 또 넣을 수 있음 
		System.out.println(result);
		
	}
}
