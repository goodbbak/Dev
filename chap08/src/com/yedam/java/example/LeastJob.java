package com.yedam.java.example;

public class LeastJob implements Scheduler{
	//현재 상담업무가 없거나 상담 대기가 가장 적은 상담원에게 배분됩니다.
	
	@Override
	public void getNextCall() {
		System.out.println("상담 순서를 순서대로 대기열에서 가져옵니다."); //상담원입장에서
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");	
	}

}
