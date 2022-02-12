package flyweight;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 12, 2022
 *
 */

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static final Map<String, Shape> MAP = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) MAP.get(color);
		if (circle == null) {
			circle = new Circle(color);
			MAP.put(color, circle);
			System.out.println("Creating circle of color: " + color);
		}
		return circle;
	}

}
