package baekjun;

import java.util.Scanner;

public class b10818최대최소 {
	public static void main(String[] args) {
		//해결 o
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();			
		int[] array =  new int[N];
		
		int max = -1000000; //범위 이렇게 하니까 맞음
		int min = 1000000;
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
			if(max<array[i]) {
				max = array[i];
			}
			if(min>array[i]) {
				min = array[i];
			}
		}
		
		System.out.println(min+" "+max);
		
		
		
		
		
		
		
		
		
		
		
	}
}
