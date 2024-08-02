package structural.composite;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 02, 2024
 */
public interface Employee {
    int getId();

    String getName();

    double getSalary();

    void print();

    void add(Employee employee);

    void remove(Employee employee);

    Employee getChild(int i);
}
