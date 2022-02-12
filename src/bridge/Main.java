package bridge;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 12, 2022
 *
 */
public class Main {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}
}
