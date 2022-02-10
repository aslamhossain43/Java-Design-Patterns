package factory;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 3, 2022
 *
 */
public class ShapeFactory {
	private Shape shape;

	public Shape getShape(String shapeType) {
		if (shapeType.equals("CIRCLE")) {
			shape = new Circle();
		} else if (shapeType.equals("SQUARE")) {
			shape = new Square();
		}
		return shape;
	}
}
