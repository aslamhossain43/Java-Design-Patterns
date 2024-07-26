package structural.decorator;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 26, 2024
 */
public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource();
        dataSource.write();
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(dataSource);
        encryptionDecorator.write();
        CompressionDecorator compressionDecorator = new CompressionDecorator(dataSource);
        compressionDecorator.write();
    }
}
