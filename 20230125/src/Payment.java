
public interface Payment {
	//상수필드
	public static double ONLINE_PAYMENT_RATIO = 0.05;
	public static double OFFLINE_PAYMENT_RATIO = 0.03;
	//추상메소드
	public double online(double price);
	public double offline(double price);
	public void showInfo();
}
