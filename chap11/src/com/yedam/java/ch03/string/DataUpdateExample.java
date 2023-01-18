package com.yedam.java.ch03.string;

public class DataUpdateExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바","JAVA");
		System.out.println("old:"+oldStr);
		System.out.println("new:"+newStr); //새로운 인스턴스를 만듦
		
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "24"); //인덱스 4번째에 값을 넣겠다
		System.out.println(sb.toString());
		
		sb.replace(7, 14, "Book");
		System.out.println(sb.toString());
		
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result);
		System.out.println(sb.toString());
	}
}
