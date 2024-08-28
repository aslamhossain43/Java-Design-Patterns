package creational.abstract_factory;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 28, 2024
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
