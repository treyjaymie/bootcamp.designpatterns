package lab.designpatterns.answer3;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = ShapeFactory.newInstance();
		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
		
		square.draw();
		circle.draw();
		rectangle.draw();
	}

}
