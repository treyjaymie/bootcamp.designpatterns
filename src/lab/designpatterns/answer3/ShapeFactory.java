package lab.designpatterns.answer3;


public class ShapeFactory {
	private static ShapeFactory INSTANCE;

    public static ShapeFactory newInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ShapeFactory();
        }
        return INSTANCE;
    }

    private ShapeFactory() {
    }
	
	public Shape getShape(ShapeType type) {
		Shape shape = null;
		switch (type) {
		case CIRCLE:
			shape = new Circle();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		}
		
		return shape;
	}
}
