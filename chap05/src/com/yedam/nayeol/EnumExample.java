package com.yedam.nayeol;

import java.util.Calendar;

public class EnumExample {
	public static void main(String[] args) {
		//today는 Week가 가지고 있는 데이터만 가질 수 있다.
		Week today = null; //Week타입의 today 변수를 만듦 Week는 앞서만든 파일
		
		//오늘의 요일이 어떤 요일인지 확인하는 프로그램
		Calendar cal = Calendar.getInstance();
		//일요일 = 1 ...토요일 = 7
		//오늘의 요일을 숫자로 알려주는 
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일:"+today);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
