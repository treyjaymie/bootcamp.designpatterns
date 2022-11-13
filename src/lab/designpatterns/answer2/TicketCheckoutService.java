package lab.designpatterns.answer2;

import java.math.BigDecimal;

import lab.designpatterns.answer2.taxrates.TaxRate;
import lab.designpatterns.answer2.ticketprices.TicketPrice;

public class TicketCheckoutService {
	
	public BigDecimal checkout(TicketPrice ticketPrice, TaxRate taxRate) {
		ticketPrice.validate();
		return taxRate.applyTaxRate(ticketPrice.getTicketPrice());
	}
}
