package baekjun;

import java.util.Scanner;

public class b1924 {
	public static void main(String[] args) {
		// 런타임에러 왜? 해결못함
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dayOfTheWeeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int sum = y; //여기서 미리 줘 놓으면 나중에 따로 안 더해도 됨

		for (int i = 0; i < x - 1; i++) {
			sum += days[i]; // 여기다 +y 를 해서 자꾸 틀림
		}
		
		System.out.println(dayOfTheWeeks[sum % 7]);
//		int rest = sum % 7;
//		switch (rest) {
//		case 0:
//			System.out.println("SUN");
//			break;
//		case 1:
//			System.out.println("MON");
//			break;
//		case 2:
//			System.out.println("TUE");
//			break;
//		case 3:
//			System.out.println("WED");
//			break;
//		case 4:
//			System.out.println("THU");
//			break;
//		case 5:
//			System.out.println("FRI");
//			break;
//		case 6:
//			System.out.println("SAT");
//			break;
//		}

		//인터넷
//		Scanner sc = new Scanner(System.in);
//		int month = sc.nextInt();
//		int day = sc.nextInt();
//		sc.close();
//		
//		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		String[] dayOfTheWeeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
//		
//		int totalDays = day;
//		for (int i = 0; i < month - 1; ++i) {
//			totalDays += daysInMonth[i];
//		}
//		
//		System.out.println(dayOfTheWeeks[totalDays % 7]);
	}
}