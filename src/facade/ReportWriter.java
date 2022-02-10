package facade;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 6, 2022
 *
 */
public class ReportWriter {
	public void writePdfReport(Report report) {
		System.out.println("PDF report written");
	}

	public void writeHtmlReport(Report report) {
		System.out.println("HTML report written");
	}
}
