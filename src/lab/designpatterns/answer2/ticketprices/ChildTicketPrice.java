package lab.designpatterns.answer2.ticketprices;

import java.util.Scanner;

public class ChildTicketPrice extends TicketPrice {
	
	Scanner in = new Scanner(System.in);
	
	public ChildTicketPrice() {
		super(10);
	}

	@Override
	public void validate() {
		System.out.print("Enter age to be validated: ");
		int age = in.nextInt();
		if (age < 16)
			System.out.println("Age is eligible for the Child ticket price.");
		else
			throw new IllegalArgumentException("Age is not eligible for the Child ticket price");
	}
}
