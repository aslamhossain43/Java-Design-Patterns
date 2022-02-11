package builder;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 11, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee().setId("1").setName("Aslam");
		System.out.println(employee.toString());

	}

}
