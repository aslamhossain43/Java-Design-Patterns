package creational.singleton;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 28, 2024
 */
public class Database {
    //    Its private so no option to access from outside
//    Its early instantiated to minimize null checking
    private static Database instance = new Database();

    //    Constructor access modifier is private to prevent new object creation
    private Database() {
    }

    public static Database getInstance() {
        return instance;
    }
}
