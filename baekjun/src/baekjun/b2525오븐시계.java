package baekjun;

import java.util.Scanner;

public class b2525오븐시계 {
	public static void main(String[] args) {
		//해결 ㅇ 단위가 다른 문제 나오면 단위를 같게 만들면 쉬움
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int m = sc.nextInt();
		
		if(M+m >= 60) {
			H += (M+m)/60;
			if (H >= 24) {
				H = H%24;
				M = (M+m)%60;
				System.out.println(H+" "+M);
			}else {				
				M = (M+m)%60;
				System.out.println(H+" "+M);
			}
		}else {	
			System.out.println(H+" "+(M+m));
		}
		
		
		//인터넷1. A(시)와 B(분)을 하나의 분으로 변환한 뒤, C를 더하고 나온 결과 값을 다시 시와 분 으로 변환하는 방법
		//2. C를 시와 분으로 변환한 뒤, 각 나뉘어진 시와 분을 A와 B에 각각 더하여 연산하는 방법
//		int H = sc.nextInt();
//		int M = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int minute = H*60+M+m;
//		H = minute/60;
//		M = minute%60;
//		if(H>=24) {
//			H = H%24;
//			
//		}
//		System.out.println(H+" "+M);
		
		
		
		
		
		
		
		
		
		
	}
}
