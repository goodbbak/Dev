package com.yedam.java.ch02_1;

public class ChildeExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();	//Child 에가서 있는지 확인 없지만 부모에게 있어서 있다고 판단, 상속시켜놔서 부모것도 내껄로판단 밑에처럼 반대경우엔 없다고 판단
		child.method2(); 																		//(부모 먼저 확인했는데 없으면 그냥없다 결론)						
		child.method3();
		
		System.out.println();
		
		Parent parent = child; //parent엔 Child인스턴스(앞서만든Child child = new Child()에의해 heap영역에 자리잡음)가 담김
		parent.method1();	//변수의 타입이Parent라 method영역의 Parent클래스(설계도)(정적영역)
		parent.method2(); 	//를먼저 확인 거기에 method1()이 있으면 heap영역으로 감 거기엔 Child인스턴스가있음
		//parent.method3();//Parent클래스(설계도)에 method3()이 없어서 heap까지 가지않고 없다고 판단
		
	}
}
