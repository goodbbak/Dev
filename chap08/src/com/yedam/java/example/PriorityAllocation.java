package com.yedam.java.example;

public class PriorityAllocation implements Scheduler {
	//고객 등급에 따라 등급이 높은 고객의 전화를 우선 가져와서 업무 능력이 좋은 상담원에게 우선 배분합니다.
	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 Skill값이 높은 상담원에게 우선적으로 배분합니다.");	
	}

}
