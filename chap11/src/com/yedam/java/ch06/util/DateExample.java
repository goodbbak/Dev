package com.yedam.java.ch06.util;

import java.text.SimpleDateFormat;
import java.util.Date; //Date라는 이름 같은 클래스 많아서 util선택

import javax.swing.text.SimpleAttributeSet;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date(); 	//Date클래스는 생성될 때의 시간을 가진 새로운 객체를 생성 따라서 변동 x <->Calendar클래스 
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //한국식으로 바꾸기위한 클래스
		String strNow = sdf.format(date);
		System.out.println(strNow);
	}
}
