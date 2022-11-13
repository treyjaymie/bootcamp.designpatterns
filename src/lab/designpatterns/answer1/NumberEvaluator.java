package lab.designpatterns.answer1;

public interface NumberEvaluator {
	
	void chain(NumberEvaluator numberEvaluator);
	String evaluate(int number);
}
