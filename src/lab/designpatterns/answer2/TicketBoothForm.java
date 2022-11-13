package lab.designpatterns.answer2;

import java.util.Scanner;

import lab.designpatterns.answer2.taxrates.TaxCategoriesList;
import lab.designpatterns.answer2.ticketprices.TicketCategoriesList;

public class TicketBoothForm {
	
	private TicketCategoriesList ticketCategoriesList;
	private TaxCategoriesList taxCategoriesList;
	private TicketBoothDisplay ticketBoothDisplay;
	private Scanner in;
	
	public TicketBoothForm(Scanner in) {
		super();
		this.ticketCategoriesList = new TicketCategoriesList();
		this.taxCategoriesList = new TaxCategoriesList();
		ticketBoothDisplay = new TicketBoothDisplay(ticketCategoriesList, taxCategoriesList);
		this.in = in;
	}
	
	public void addCategoryToTicketCategories() {
		ticketBoothDisplay.displayTicketCategories();
		System.out.print("Enter the title for the new category: ");
		String categoryTitle = in.next();
		System.out.print("Enter the ticket price for the new category: ");
		float categoryTicketPrice = in.nextFloat();
		ticketCategoriesList.addCategory(categoryTitle, categoryTicketPrice);
	}
	
	public void removeCategoryFromTicketCategories() {
		ticketBoothDisplay.displayTicketCategories();
		System.out.print("Enter the title of the category to be removed: ");
		String categoryTitle = in.next();
		ticketCategoriesList.removeCategory(categoryTitle);
	}
	
	public void addCategoryToTaxCategories() {
		ticketBoothDisplay.displayTaxCategories();
		System.out.print("Enter the title for the new category: ");
		String categoryTitle = in.next();
		System.out.print("Enter the tax rate for the new category: ");
		float categoryTicketPrice = in.nextFloat();
		taxCategoriesList.addCategory(categoryTitle, categoryTicketPrice);
	}
	
	public void removeCategoryFromTaxCategories() {
		ticketBoothDisplay.displayTaxCategories();
		System.out.print("Enter the title of the category to be removed: ");
		String categoryTitle = in.next();
		taxCategoriesList.removeCategory(categoryTitle);
	}
	
	public void processSale() {
		ticketBoothDisplay.displayTicketCategories();
		System.out.print("Select a ticket price category title: ");
		String ticketPriceCategory = in.next();
		ticketBoothDisplay.displayTaxCategories();
		System.out.print("Select a tax rate category title: ");
		String taxRateCategory = in.next();
		ticketBoothDisplay.displaySale(ticketPriceCategory, taxRateCategory);
	}
}
