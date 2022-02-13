package composite;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 13, 2022
 *
 */
public class Manager implements Employee {
	private String name;
	private String position;

	public Manager(String name, String position) {
		this.name = name;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee name: " + name + ", position: " + position);

	}

}
