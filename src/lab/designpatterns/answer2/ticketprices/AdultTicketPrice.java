package lab.designpatterns.answer2.ticketprices;

import java.util.Scanner;

public class AdultTicketPrice extends TicketPrice {
	
	Scanner in = new Scanner(System.in);
	
	public AdultTicketPrice() {
		super(15);
	}

	@Override
	public void validate() {
		System.out.print("Enter age to be validated: ");
		int age = in.nextInt();
		if (15 < age && age < 65)
			System.out.println("Age is eligible for the Adult ticket price.");
		else
			throw new IllegalArgumentException("Age is not eligible for the Adult ticket price");
	}
}
