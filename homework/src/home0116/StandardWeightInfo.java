package home0116;

public class StandardWeightInfo extends Human {	
	// 필드
	
	// 생성자
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		//this.name = name;
		//this.height = height; 부모자식 안겹치는데 왜 안됨?
		//this.weight = weight;
	}

	

	// 메소드
	@Override
	public void getInformation() {
		System.out.println("이름:"+name+",키:"+height+",몸무게:"+weight+",표준체중:"+getStandardWeight());
	}
	
	public double getStandardWeight() {
		return (height - 100) * 0.9;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
