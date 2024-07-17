package structural.facade;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 14, 2024
 */
public class ReportGeneratorFacade {
    public static void generateReport(ReportType reportType) {
        Report report = new Report();
        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());
        report.setData(new ReportData());
        ReportWriter reportWriter = new ReportWriter();
        reportWriter.writeReport(reportType);
        System.out.println();
    }
}
