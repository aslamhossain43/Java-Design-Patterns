package structural.decorator;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 26, 2024
 */
public class DataSourceDecorator implements DataSource {
    private final DataSource wrapper;

    public DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void write() {
        wrapper.write();
    }

}
