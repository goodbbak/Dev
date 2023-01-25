
public class DGBCard extends Card{
	//필드
	final String company = "대구은행";
	String cardStaff;
	//생성자
	public DGBCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;			
	}
	//메소드
	@Override
	public void showCardInfo() {		
		super.showCardInfo();
		System.out.println("담당직원 - "+cardStaff+","+company);
	}
	
}
