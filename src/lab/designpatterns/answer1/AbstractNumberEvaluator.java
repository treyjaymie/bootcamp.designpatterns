package lab.designpatterns.answer1;

public abstract class AbstractNumberEvaluator implements NumberEvaluator {

	private int VALUE;
	private String VALUE_REPRESENTATION;
	
	private final static int HUNDRED = 100;
	private final static int TEN = 10;
	
	private NumberEvaluator numberEvaluator;
	
	public AbstractNumberEvaluator(int value, String valueRepresentation) {
		VALUE = value;
		VALUE_REPRESENTATION = valueRepresentation;
	}
	
	@Override
	public void chain(NumberEvaluator numberEvaluator) {
		this.numberEvaluator = numberEvaluator;
	}

	// max integer value of number is 2_147_483_647
	@Override
	public String evaluate(int number) {
		String representation = "";
		
		if (number > VALUE) {
			int numberProcessed = number / VALUE;
			final int numberLeft = number % VALUE;
			
			// HUNDREDS DIGIT
			final int hundredsDigit = numberProcessed / HUNDRED;
			numberProcessed = numberProcessed % HUNDRED;
			if (hundredsDigit != 0)
				representation += evaluateHundreds(hundredsDigit);
			
			// TENS DIGIT
			final int tensDigit = numberProcessed / TEN;
			if (tensDigit > 1) {
				representation += evaluateTens(tensDigit);
				numberProcessed = numberProcessed % TEN;
			}
					
			// ONES DIGIT & SPECIAL CASE 19-11
			representation += evaluateSpecialAndOnes(numberProcessed);
			
			representation += " " + VALUE_REPRESENTATION;
			
			if (numberLeft > 0)
				representation = representation + numberEvaluator.evaluate(numberLeft);
		} else {
			representation += numberEvaluator.evaluate(number);
		}
		
		return representation;
	}

	private String evaluateHundreds(int digit) {
		
		final String HUNDREDS_WORD = " Hundred ";
		String evaluatedWord;
		
		switch(digit) {
		case 0: return "";
		case 9: evaluatedWord = "Nine"; break;
		case 8: evaluatedWord =  "Eight"; break;
		case 7: evaluatedWord = "Seven"; break;
		case 6: evaluatedWord = "Six"; break;
		case 5: evaluatedWord = "Five"; break;
		case 4: evaluatedWord = "Four"; break;
		case 3: evaluatedWord = "Three"; break;
		case 2: evaluatedWord = "Two"; break;
		case 1: evaluatedWord = "One"; break;
		default: evaluatedWord = ""; break;
		}
		
		return (evaluatedWord + HUNDREDS_WORD);
	}
	
	private String evaluateTens(int digit) {
		switch(digit) {
		case 9: return "Ninety ";
		case 8: return "Eighty ";
		case 7: return "Seventy ";
		case 6: return "Sixty ";
		case 5: return "Fifty ";
		case 4: return "Forty ";
		case 3: return "Thirty ";
		case 2: return "Twenty ";
		default: return "";
		}
	}
	
	private String evaluateSpecialAndOnes(int digit) {
		switch(digit) {
		case 19: return "Nineteen";
		case 18: return "Eighteen";
		case 17: return "Seventeen";
		case 16: return "Sixteen";
		case 15: return "Fifteen";
		case 14: return "Fourteen";
		case 13: return "Thirteen";
		case 12: return "Twelve";
		case 11: return "Eleven";
		case 10: return "Ten";
		case 9: return "Nine";
		case 8: return "Eight";
		case 7: return "Seven";
		case 6: return "Six";
		case 5: return "Five";
		case 4: return "Four";
		case 3: return "Three";
		case 2: return "Two";
		case 1: return "One";
		default: return "";
		}
	}
}
