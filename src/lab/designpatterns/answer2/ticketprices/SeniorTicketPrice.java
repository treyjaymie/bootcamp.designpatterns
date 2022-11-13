package lab.designpatterns.answer2.ticketprices;

import java.util.Scanner;

public class SeniorTicketPrice extends TicketPrice {
	
	Scanner in = new Scanner(System.in);
	
	public SeniorTicketPrice() {
		super(12);
	}

	@Override
	public void validate() {
		System.out.print("Enter age to be validated: ");
		int age = in.nextInt();
		if (64 < age)
			System.out.println("Age is eligible for the Senior ticket price.");
		else
			throw new IllegalArgumentException("Age is not eligible for the Senior ticket price");
	}
}
