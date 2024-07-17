package structural.facade;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 14, 2024
 */
public class Main {
    public static void main(String[] args) {
        ReportGeneratorFacade.generateReport(ReportType.PDF);
        ReportGeneratorFacade.generateReport(ReportType.HTML);
    }
}
