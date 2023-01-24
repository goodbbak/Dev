package baekjun;

import java.util.Scanner;

public class b2884알람 {
	public static void main(String[] args) {
		// 내답
		Scanner sc = new Scanner(System.in);

		//System.out.println("H>"); 이거 지우니까 맞음
		int H = sc.nextInt();

		//System.out.println("M>");
		int M = sc.nextInt();

		if (M < 45) {
			if (H < 1) {
				M += 15;
				H = 23;
			} else {
				M += 15;
				H--;
			}

		} else
			M -= 45;

		System.out.printf(H + " " + M);

		// 인터넷 답
//		Scanner sc = new Scanner(System.in);
//
//		int H = sc.nextInt();
//		int M = sc.nextInt();
//		sc.close();
//
//		if (M < 45) {
//			H--;
//			M = 60 - (45 - M);
//			if (H < 0) {
//				H = 23;
//			}
//			System.out.println(H + " " + M);
//		} else {
//			System.out.println(H + " " + (M - 45));
//		}

	}
}
