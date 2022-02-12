package bridge;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 12, 2022
 *
 */
public class Bike extends Vehicle {
	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike");
		workshop1.work();
		workshop2.work();
	}

}
