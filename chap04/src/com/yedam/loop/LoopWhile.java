package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		//1~100사이의 2의배수
		int i = 1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}

		//계산기 프로그램
		//무한 루프 조건으로 프로그램 실행
		//event(trigger) 프로그램 종료.->break;
		boolean run =true;
		Scanner sc = new Scanner(System.in);
		while(run){ //while 안의 조건이 true 일때 while문 실행
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.종료");
			System.out.println("입력>");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: 
				System.out.println("더하고자 하는 두 수 입력>");
				System.out.println("1>");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num2 = Integer.parseInt(sc.nextLine());
				int result = num1 + num2;
				System.out.println(num1+"+"+num2+"의 결과="+result);
				break;
			case 2:
				System.out.println("빼고자 하는 두 수 입력>");
				System.out.println("num3>");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("num4>");
				int num4 = Integer.parseInt(sc.nextLine());
				int result2 = num3 - num4;
				System.out.println(num3+"-"+num4+"의 결과="+result2);
				break;
			case 3:
				System.out.println("곱하고자 하는 두 수 입력>");
				System.out.println("num5>");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.println("num6>");
				int num6 = Integer.parseInt(sc.nextLine());
				int result3 = num5 * num6;
				System.out.println(num5+"*"+num6+"의 결과="+result3);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("1~4사이 수를 입력해주세요");
			}
			
		}
		System.out.println("end of prog");
		
		//게임 만들기
		//컴퓨터와 가위,바위,보
		//동전 앞,뒤 맞추기
		//한 판에 500원
		int money;
		System.out.println("insert coin>");
		money = Integer.parseInt(sc.nextLine());
		boolean flag = true; //강제 종료용
		while(money>=500 && flag) {
			
			System.out.println((money/500)+"번의 기회가 남았음");
			System.out.println("1.가위바위보|2.앞뒤맞추기|3.종료");
			
			System.out.println("입력>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch(gameNo) {
			case 1: System.out.println("가위바위보중입력");
				String RSP = sc.nextLine();
				int randomNo = (int)(Math.random()*3)+1;
				if(RSP.equals("가위")) { //String만 변수에 저장하는 방식이 달라서 이런식으로 위방식으로 변수지정하면 변수내용의 주소지가 변수에 담김
					//가위 == 1			equals쓰면 주소지 아닌 값 자체를 비교		
					if(randomNo == 1) {
						System.out.println("비김");
					} else if(randomNo == 2) {
						System.out.println("짐");
					} else if(randomNo == 3) {
						System.out.println("이김");
					}
				} else if(RSP.equals("바위")) {
					if(randomNo == 1) {
						System.out.println("이김");
					} else if(randomNo == 2) {
						System.out.println("비김");
					} else if(randomNo == 3) {
						System.out.println("짐");
					}
				} else if(RSP.equals("보")) {
					if(randomNo == 1) {
						System.out.println("짐");
					} else if(randomNo == 2) {
						System.out.println("이김");
					} else if(randomNo == 3) {
						System.out.println("비김");
					}
				}
				money -= 500;
				break; //switch문을 나감
			
			case 2:
				System.out.println("앞 또는 뒤 선택>");
				String myChoice = sc.nextLine();
				int fb = (int)(Math.random()*2)+1;
				if(myChoice.equals("앞")) {
					if(fb==1) {
						System.out.println("정답");
					} else if(fb==2) {
						System.out.println("틀림");
					}
				} else if(myChoice.equals("뒤")) {
					if(fb==1) {
						System.out.println("틀림");
					} else if(fb==2) {
						System.out.println("정답");
					}
				} else {
					System.out.println("앞 또는 뒤 중 하나만 입력");
					break;
				}
				money -= 500;
				break;
			
			case 3:
				//종료 ..1)투입 금액이 다 소진 됐을 때
				//      2)강제 종료
				flag = false;				
				break;
			default:
				System.out.println("1~3사이 수만 입력하세요");
				break;
			}
			if(money<500) {
				System.out.println("금액이 부족해 더이상 게임 진행 불가");
			}
			System.out.println("게임 종료");					
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private static void While(boolean run) {
		// TODO Auto-generated method stub
		
	}

}
