package lab.designpatterns.answer2.ticketprices;

public class CustomTicketPrice extends TicketPrice{
	
	public CustomTicketPrice() {
		super();
	}
	
	public CustomTicketPrice(int price) {
		super(price);
	}
	
	public CustomTicketPrice(float price) {
		super(price);
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}
}
