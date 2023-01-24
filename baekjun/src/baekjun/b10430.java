package baekjun;

import java.util.Scanner;

public class b10430 {
	public static void main(String[] args) {
		//내 풀이인데 자꾸 런타임 에러 => 범위 지정 안해줘도 되는데 해서 그랬음
		Scanner sc = new Scanner(System.in);

		int A = 0;
		do {
			System.out.println("A값>");
			A = Integer.parseInt(sc.nextLine());
			if(A < 2 || A > 10000) {
				System.out.println("2~10000사이 입력");
			}			
		} while(A < 2 || A > 10000);
		
					
		int B = 0;
		do {
			System.out.println("B값>");
			B = Integer.parseInt(sc.nextLine());
			if(B < 2 || B > 10000) {
				System.out.println("2~10000사이 입력");
			}			
		} while(B < 2 || B > 10000);
		
		int C = 0;
		do {
			System.out.println("C값>");
			C = Integer.parseInt(sc.nextLine());
			if(C < 2 || C > 10000) {
				System.out.println("2~10000사이 입력");
			}			
		} while(C < 2 || C > 10000);
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println( ((A%C) * (B%C))%C);
	
		
		
		
		  	//정답 2<=10000범위는 자동으로 지정돼서 안해도 됐음;
//		        Scanner sc = new Scanner(System.in);
//		        int a,b,c; //요거 몰랐음
//		        a = sc.nextInt();
//		        b = sc.nextInt();
//		        c = sc.nextInt();
//		       
//		            System.out.println((a+b)%c);
//		            System.out.println(((a%c)+(b%c))%c);
//		            System.out.println((a*b)%c);
//		            System.out.println((a%c)*(b%c)%c); 
		  
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
