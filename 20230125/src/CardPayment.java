
public class CardPayment implements Payment {
	//필드
	double cardRatio;
	
	//생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	//메소드
	@Override
	public double online(double price) {
		double last = price-price*(cardRatio + Payment.ONLINE_PAYMENT_RATIO);
		return last;
	}

	@Override
	public double offline(double price) {
		double last = price-price*(cardRatio + Payment.OFFLINE_PAYMENT_RATIO);
		return last;
	}

	@Override
	public void showInfo() {
		System.out.println("카드결제시할인정보");
		System.out.println("온라인 결제시 총 할인율 : "+(cardRatio+Payment.ONLINE_PAYMENT_RATIO)+
				"\n오프라인 결제시 총 할인율 : "+(cardRatio+Payment.OFFLINE_PAYMENT_RATIO));
		
	}
}
