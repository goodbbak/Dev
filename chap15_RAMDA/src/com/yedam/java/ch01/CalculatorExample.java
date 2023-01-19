package com.yedam.java.ch01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator() {

			@Override
			public double plus(double x, double y) {
				return x + y;
			}
			
		};
		
		//위의 코드를 람다식으로
		Calculator ramda = (x,y) -> x + y ;
		
		System.out.println("cal :"+ cal.plus(10.5,15.8));
		System.out.println("ramda :"+ ramda.plus(10.5,15.8));
	}
}
