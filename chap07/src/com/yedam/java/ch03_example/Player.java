package com.yedam.java.ch03_example;

public class Player {
	//필드
	private PlayerLevel level;
	//생성자
	public Player() {
		level = new BeginnerLevel(); //처음에 player는 비기너로 시작
		level.showLevelMessage();
	}
	//메소드
	public PlayerLevel getLevel1() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();	
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
