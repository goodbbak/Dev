package baekjun;

import java.util.Scanner;

public class b4344평균중급 {
	public static void main(String[] args) {
		//해결 ㅇ
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[][] cArray = new int[c][]; //굳이 배열 두개 만들필요 없었음 한개로 쉽게 가능
		int elite = 0;
		int students; 
		int stScore;
		int sum =0;
		double avg;
		double percent;
		for(int i=0;i<c;i++) {
			students = sc.nextInt();
			cArray[i] = new int[students];   //배열안의 배열 크기 각기 다르게 하는 학생수만큼크기의 배열만들기
			for(int j=0;j<students;j++) {    //학생수배열에 점수 넣기				
				stScore = sc.nextInt();
				cArray[i][j] = stScore;		
				sum += stScore;
			}
			avg = sum/students;
			for(int j=0;j<students;j++) {
				if(avg<cArray[i][j]) {
					elite ++;
				}
			}		
			System.out.println(String.format("%.3f",(100*(double)elite/students))+"%");
			sum = 0;	//*주의*for문 한번 돌때마다 초기화 다시 해줘야됨 
			elite = 0;	//얘들은 값이 =으로 변하는게 아니라 +로 추가 되는거니까
		}
		
		//다시 풀어보기 짧게 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
