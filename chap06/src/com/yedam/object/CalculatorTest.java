package com.yedam.object;

import java.util.Calendar;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int result = calc.sum(10,20);
		System.out.println(result);
		//calc=null; 객체 지워서 메모리 관리 이거 하기싫으니 싱글톤 
		Calculator calc1 = new Calculator();
		int result1 = calc.sum(10,20);
		System.out.println(result1);
		
		System.out.println(calc==calc1); //참조변수라 다름
		
		//싱글톤 CalculatorSingle
		CalculatorSingle calSingle =  CalculatorSingle.getInstance();//getInstance가 싱글톤으로 만들어진걸 의미
		CalculatorSingle calSingle2 =  CalculatorSingle.getInstance();//CalculatorSingle클래스에있는getInstance()메소드(객체를호출하는기능있는)를사용
		System.out.println(calSingle==calSingle2); //true 싱글톤으로 만들어진 같은 객체를 참조하기에
		
		//싱글톤이 사용된 예시
		Calendar today = Calendar.getInstance();
		today.set(2023,2,1);
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
