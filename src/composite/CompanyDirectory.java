package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 13, 2022
 *
 */
public class CompanyDirectory implements Employee {
	private List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void showEmployeeDetails() {
		for (Employee employee : employees) {
			employee.showEmployeeDetails();
		}

	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		this.employees.remove(employee);
	}
}
