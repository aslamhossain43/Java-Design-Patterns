package structural.facade;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 14, 2024
 */
public class ReportWriter {
    public void writeReport(ReportType reportType) {
        switch (reportType) {
            case PDF -> {
                System.out.println("PDF report is generated");
            }
            case HTML -> {
                System.out.println("HTML report is generated");
            }
            default -> System.out.println("Report is not generated");
        }
    }
}
