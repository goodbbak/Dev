package com.yedam.java.example;

import java.util.Scanner;

public class ScheduleExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scheduler scheduler = null;
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		
		
		String ch = scanner.next();
		
		if("R".equals(ch) || "r".equals(ch) ) {
			scheduler = new RoundRobin(); //new연산자로 객체 생성할 수 있는건 일반클래스 뿐
		}else if("L".equals(ch) || "l".equals(ch) ) {
			scheduler = new LeastJob();	
		}else if("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		//scheduler의 실제 객체가 무엇인지 확인없고
		//scheduler안에는 무조건getNextCall(),sendCallToAgent()가 있다는 뜻은 두메소드는 추상메소드고 따라서 scheduler는 interface or 추상클래스
		scheduler.getNextCall();	//상담원 :다음전화/ 왼쪽에 return을 받을 변수 없는것으로 이 메소드는 void인것 유추
		scheduler.sendCallToAgent(); //배분방법
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
