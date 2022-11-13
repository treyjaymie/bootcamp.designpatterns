package lab.designpatterns.answer1;

import java.util.Scanner;

public class IntegerToEnglishEvaluator {
	private NumberEvaluator billionsNumberEvaluator;
	private NumberEvaluator millionsNumberEvaluator;
	private NumberEvaluator thousandsNumberEvaluator;
	private NumberEvaluator onesNumberEvaluator;
	
	public IntegerToEnglishEvaluator() {
		billionsNumberEvaluator = new BillionsNumberEvaluator();
		millionsNumberEvaluator = new MillionsNumberEvaluator();
		thousandsNumberEvaluator = new ThousandsNumberEvaluator();
		onesNumberEvaluator = new OnesNumberEvaluator();
		
		billionsNumberEvaluator.chain(millionsNumberEvaluator);
		millionsNumberEvaluator.chain(thousandsNumberEvaluator);
		thousandsNumberEvaluator.chain(onesNumberEvaluator);
	}
	
	public String evaluate(int number) {
		if (number == 0)
			return "Zero";
		
		String representation = billionsNumberEvaluator.evaluate(number);
		
		return representation;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntegerToEnglishEvaluator evaluator = new IntegerToEnglishEvaluator();
		
		System.out.print("Enter non-negative integer: ");
		int input = in.nextInt();
		
		System.out.println(
					evaluator.evaluate(input)
				);
		System.out.println("END");
		// Finished 3:07 PM T^T
	}
}
