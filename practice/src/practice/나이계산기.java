package practice;

import java.time.LocalDate;
import java.util.Scanner;

public class 나이계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
//		String[] split = input.split("");		
//		int answer = 0;
//		
//		if(split[0].equals("0")) { //String은 equals로 비교 주의
//			answer = 24-Integer.parseInt(split[1]);
//			System.out.println(answer);		
//		}else {
//			answer = 100-(Integer.parseInt(split[0])*10+Integer.parseInt(split[1]))+24;
//			System.out.println(answer);
//		}
		
		
		
		
		//1번 방법 하드코딩,올해만 사용가능
		//2000년 이후 23년 이전 출생	(23 - 태어난 년도)+1
		//1922년 이후 2000년 이전 출생	(123 - 태어난 년도)
		
		//2번방식 일반화
		//Calendar or date(simpledateFormat) => 오늘 날짜,년도
		//2000년 이후 23년 이전 출생	->	(기준년도 - 태어난 년도)+1
		//1922년 이후 2000년 이전 출생	->  (기준년도 - 태어난 년도)
				
		System.out.println("생년월일>");
		String birth = sc.nextLine();
		
		int birthNo = Integer.parseInt(birth.substring(0,2)); //시작0번인덱스부터 2번인덱스 '앞'까지 자른다<->db는 1부터시작
		
		if(birthNo <= 23) {//2000년 이후 23년 이전 출생	->	(기준년도 - 태어난 년도)+1
			System.out.println("나이 :"+(23-birthNo)+1);
		}else if(birthNo>23) {//1922년 이후 2000년 이전 출생	->  (기준년도 - 태어난 년도)
			System.out.println("나이 :"+(123-birthNo));
		}
		
		
		
		//StringBuilder => String단점 보완 -> 새로 영역 안 생기고 a있던 그 영역에 추가 됨 
		String a = "a";
		a += "a";	//heap영역에 a하나있는거 두고 aa aaa aaaa영역 계속 생김 ->메모리 낭비
		a += "a";
		a += "a";
		a += "a";
		
		StringBuilder sb = new StringBuilder(); //메모리 한개만 사용
		sb.append("aaa");
		sb.append(1);
		sb.append(false);
		
		System.out.println(sb);
		
		
		
		
		
	}
}
