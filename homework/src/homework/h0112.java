package homework;

import java.util.Scanner;

public class h0112 {
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		Scanner sc = new Scanner(System.in);
		
		
		Object[] objAry = null; //상품객체를 담을 배열 생성
		int objno =0; //왜 여기다 한번 해주는지 생각
		while(true) {		
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			int selectNo = Integer.parseInt(sc.nextLine());
			if(selectNo == 1) {
				System.out.println("등록할 상품 수 입력>");
				objno = Integer.parseInt(sc.nextLine());
				
			} else if(selectNo == 2) {
				objAry = new Object[objno];  //이거를 1번에서 만들면 1번 한번 거치고 나면 수정 불가 
				for(int i=0;i<objAry.length;i++) {
					objAry[i] = new Object();
					System.out.println((i+1)+"번째 상품명 입력>");
					objAry[i].name = sc.nextLine();
					System.out.println((i+1)+"번째 상품가격 입력>");
					objAry[i].price = Integer.parseInt(sc.nextLine());
				}
				
			} else if(selectNo == 3) {
				for(int i=0;i<objAry.length;i++) {
					System.out.println((i+1)+"번째 상품가격:"+objAry[i].price);
				}
				
			} else if(selectNo == 4) {
				int max = objAry[0].price;
				String objectName;
				for(int i=0;i<objAry.length;i++) {
					if(max<objAry[i].price) {
						max = objAry[i].price;
						objectName = objAry[i].name;
					}
				}System.out.println("");
				
			} else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}    
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
