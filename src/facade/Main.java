package facade;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		ReportGeneratorFacade.generateReport(ReportType.PDF);
		ReportGeneratorFacade.generateReport(ReportType.HTML);

	}

}
