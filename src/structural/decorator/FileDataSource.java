package structural.decorator;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 26, 2024
 */
public class FileDataSource implements DataSource {

    @Override
    public void write() {
        System.out.println("File is writing");
    }
}
