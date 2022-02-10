package abstract_factory;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 3, 2022
 *
 */
public class RoundShapFactory extends AbstractFactory {
	private Shape shape;

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equals("ROUND RECTANGLE")) {
			shape = new RoundRectangle();
		} else if (shapeType.equals("ROUND SQUARE")) {
			shape = new RoundSquare();
		}
		return shape;
	}

}
