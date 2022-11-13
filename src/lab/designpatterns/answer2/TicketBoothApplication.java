package lab.designpatterns.answer2;

import java.util.Scanner;

public class TicketBoothApplication {

	private static TicketBoothForm ticketBoothForm;
	
	public static void main(String[] args) {
		System.out.println("Ticket Booth Application\n");
		Scanner in = new Scanner(System.in);
		ticketBoothForm = new TicketBoothForm(in);
		
		while (true) {
			displayMenuOptions();
			int menuOption = in.nextInt();
			switch (menuOption) {
			case 5:
				ticketBoothForm.addCategoryToTicketCategories();
				break;
			case 4:
				ticketBoothForm.removeCategoryFromTicketCategories();
				break;
			case 3:
				ticketBoothForm.addCategoryToTaxCategories();
				break;
			case 2:
				ticketBoothForm.removeCategoryFromTaxCategories();
				break;
			case 1:
				ticketBoothForm.processSale();
				break;
			case 0:
				System.out.println("Exiting Ticket Booth Application. Have a great day!");
				return;
			default:
				System.out.println("Indicate a valid menu option");
			}
		}
	}

	private static void displayMenuOptions() {
		System.out.println("Select a menu option");
		System.out.println("5 - Add Ticket Price Category");
		System.out.println("4 - Remove Ticket Price Category");
		System.out.println("3 - Add Tax Rate Category");
		System.out.println("2 - Remove Tax Rate Category");
		System.out.println("1 - Process Ticket Sale");
		System.out.println("0 - Exit");
		System.out.print("Enter input: ");
	}
}
