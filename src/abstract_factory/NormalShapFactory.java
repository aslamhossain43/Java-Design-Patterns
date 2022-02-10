package abstract_factory;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 3, 2022
 *
 */
public class NormalShapFactory extends AbstractFactory {
	private Shape shape;

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equals("RECTANGLE")) {
			shape = new Rectangle();
		} else if (shapeType.equals("SQUARE")) {
			shape = new Square();
		}
		return shape;
	}

}
