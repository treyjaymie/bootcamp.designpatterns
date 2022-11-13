package lab.designpatterns.answer2.ticketprices;

import java.math.BigDecimal;

public abstract class TicketPrice {
	private BigDecimal price;

	public TicketPrice() {
		
	}
	
	public TicketPrice(BigDecimal price) {
		this.price = price;
	}
	
	public TicketPrice(int price) {
		this.price = new BigDecimal(price);
	}
	
	public TicketPrice(float price) {
		this.price = new BigDecimal(price);
	}
	
	public BigDecimal getTicketPrice() {
		return price;
	}
	
	public void setTicketPrice(BigDecimal price) {
		this.price = price;
	}
	
	public void setTicketPrice(int price) {
		this.price = new BigDecimal(price);
	}
	
	public void setTicketPrice(float price) {
		this.price = new BigDecimal(price);
	}

	@Override
	public String toString() {
		return "$" + price;
	}

	public abstract void validate();
}
