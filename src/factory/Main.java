package factory;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape1.draw();
		shape2.draw();
	}

}
