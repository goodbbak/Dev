package home0116;

public class ObesityInfo extends StandardWeightInfo {
	// 필드
	
		// 생성자
		public ObesityInfo(String name, int height, int weigth) {
			super(name, height, weigth);

		}

		// 메소드
		@Override
		public void getInformation() {
			System.out.println(name+"님의 신장:"  + height + ",몸무게:" + weight+"비만도:"+getObesity());
		}
		
		public double getObesity() {
			return (weight - getStandardWeight())/getStandardWeight() * 100;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
