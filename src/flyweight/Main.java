package flyweight;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 12, 2022
 *
 */
public class Main {
	private static final String COLORS[] = { "Red", "Green", "Blue" };

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}

	}

	private static String getRandomColor() {
		return COLORS[(int) (Math.random() * COLORS.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

}
