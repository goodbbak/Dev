package 싱글톤;

public class Singleton {
	private static Singleton singleton = null;
	
	//생성자 막음=>외부에서 싱글톤객체 생성 못함
	private Singleton() {
		
	}
	//외부에서 Singleton 내부에서 만든 객체 연걸하는 메소드.
	public Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
