package structural.decorator;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 26, 2024
 */
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public void write() {
        super.write();
        System.out.println(" and encryption also");
    }
}
