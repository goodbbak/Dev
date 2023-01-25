
public class SimplePayment implements Payment{
	double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public double online(double price) {
		double last = price-price*(simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO);
		return last;
	}

	@Override
	public double offline(double price) {
		double last = price-price*(simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO);
		return last;
	}

	@Override
	public void showInfo() {
		System.out.println("온라인결제시할인정보");
		System.out.println("온라인 결제시 총 할인율 : "+(simplePaymentRatio+Payment.ONLINE_PAYMENT_RATIO)+
				"\n오프라인 결제시 총 할인율 : "+(simplePaymentRatio+Payment.OFFLINE_PAYMENT_RATIO));
		
	}
}
