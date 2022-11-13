package lab.designpatterns.answer2;

import java.util.Scanner;

import lab.designpatterns.answer2.taxrates.TaxCategoriesList;
import lab.designpatterns.answer2.ticketprices.TicketCategoriesList;

public class TicketBoothDisplay {
	
	private TicketCategoriesList ticketCategoriesList;
	private TaxCategoriesList taxCategoriesList;
	private TicketCheckoutService ticketCheckoutService;
	
	public TicketBoothDisplay(TicketCategoriesList ticketCategoriesList, TaxCategoriesList taxCategoriesList) {
		super();
		this.ticketCategoriesList = ticketCategoriesList;
		this.taxCategoriesList = taxCategoriesList;
		this.ticketCheckoutService = new TicketCheckoutService();
	}

	public void displayTicketCategories() {
		for (int index = 0; index < ticketCategoriesList.getSize(); index++) {
			System.out.println(String.format("\t%s\t\t%s",
											ticketCategoriesList.getCategoryTitles().get(index),
											ticketCategoriesList.getTicketPrices().get(index).toString()
											));
		}
	}
	
	public void displayTaxCategories() {
		for (int index = 0; index < taxCategoriesList.getSize(); index++) {
			System.out.println(String.format("\t%s\t\t%s",
											taxCategoriesList.getCategoryTitles().get(index),
											taxCategoriesList.getTaxRates().get(index).toString()
											));
		}
	}
	
	public void displaySale(String ticketPriceCategory, String taxRateCategory) {
		System.out.println(String.format("\nTicket Sale Calculation: $%.02f\n",
										 ticketCheckoutService.checkout(
												ticketCategoriesList.getCategory(ticketPriceCategory),
												taxCategoriesList.getCategory(taxRateCategory)
										 )
		));
	}
}
