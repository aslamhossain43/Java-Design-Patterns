package composite;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 13, 2022
 *
 */
public class Developer implements Employee {
	private String name;
	private String position;

	public Developer(String name, String position) {
		this.name = name;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee name: " + name + ", position: " + position);

	}

}
