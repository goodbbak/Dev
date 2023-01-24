package baekjun;

import java.util.Scanner;

public class b10871x보다작은수 {
	//해결 ㅇ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int x = sc.nextInt();
		
		int num;
		for(int i=0;i<N;i++) {
			//System.out.println((i+1)+"번째 수 입력>"); 이것도 이거하면 틀림
			num = sc.nextInt();
			A[i] = num;
		}
		
		for(int i=0;i<N;i++) {
			if(x>A[i]) {
				System.out.println(A[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
