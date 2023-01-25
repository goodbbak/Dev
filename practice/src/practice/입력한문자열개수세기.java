package practice;

import java.util.Scanner;

public class 입력한문자열개수세기 {
	public static void main(String[] args) {
		//중복되는 문자가 몇개가 존재하는지
		//a~z:26개가 다 들어온다는 가정
		//0~25,각각의 인덱스 어떤 문자를 의미하는지
		// 0->a, 1->b... 25->z
		//아스키코드 : a => 97, b=> 98...
		//내가 입력한 문자 - 97 = 배열의 인덱스 값
		//ary[내가 입력한 문자 - 97] => 0~25(a~Z)의 자리와 갯수를 의미.
		Scanner sc = new Scanner(System.in);
		
		int charAry[] = new int[26];
		System.out.println("문자열입력>");
		String str2 = sc.nextLine().toLowerCase();  //입력한 문자 소문자로 변환
		
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i); //str2.subString(i,i+1);=>다른 방식(subString)으로 자르기			
			charAry[ch-'a']++;
		}
		
		for(int i=0;i<charAry.length;i++) {
			if(charAry[i] != 0) {
				System.out.print((char)(97+i)+" "+charAry[i]+"개");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
