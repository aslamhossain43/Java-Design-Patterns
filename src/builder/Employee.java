package builder;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 4, 2022
 *
 */
public class Employee {
	private String id;
	private String name;

	public Employee setId(String id) {
		this.id = id;
		return this;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
