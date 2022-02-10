package facade;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 6, 2022
 *
 */
public class ReportGeneratorFacade {
	public static void generateReport(ReportType reportType) {
		Report report = new Report();
		report.setHeader(new Header());
		report.setBody(new Body());
		report.setFooter(new Footer());

		ReportWriter reportWriter = new ReportWriter();
		switch (reportType) {
		case PDF:
			reportWriter.writePdfReport(report);
			break;
		case HTML:
			reportWriter.writeHtmlReport(report);
			break;
		default:
			break;
		}
	}
}
