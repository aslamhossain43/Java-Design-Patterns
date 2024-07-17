package structural.facade;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 14, 2024
 */
public class Report {
    private ReportHeader header;
    private ReportData data;
    private ReportFooter footer;

    public void setHeader(ReportHeader header) {
        System.out.println("Prepared report header");
        this.header = header;
    }

    public void setData(ReportData data) {
        System.out.println("Prepared report data");
        this.data = data;
    }

    public void setFooter(ReportFooter footer) {
        System.out.println("Prepared report footer");
        this.footer = footer;
    }

    public ReportHeader getHeader() {
        return header;
    }

    public ReportData getData() {
        return data;
    }

    public ReportFooter getFooter() {
        return footer;
    }
}
