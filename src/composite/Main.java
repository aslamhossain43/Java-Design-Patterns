package composite;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 13, 2022
 *
 */
public class Main {
	public static void main(String[] args) {
		Developer developer1 = new Developer("Atif", "Junior Software Engineer");
		Developer developer2 = new Developer("Aslam", "Software Engineer");
		CompanyDirectory developerDirectory = new CompanyDirectory();
		developerDirectory.addEmployee(developer1);
		developerDirectory.addEmployee(developer2);

		Manager manager1 = new Manager("Ronald", "Assistant");
		Manager manager2 = new Manager("John", "Chief");
		CompanyDirectory managerDirectory = new CompanyDirectory();
		managerDirectory.addEmployee(manager1);
		managerDirectory.addEmployee(manager2);

		CompanyDirectory companyDirectory = new CompanyDirectory();
		companyDirectory.addEmployee(developerDirectory);
		companyDirectory.addEmployee(managerDirectory);
		companyDirectory.showEmployeeDetails();

	}
}
