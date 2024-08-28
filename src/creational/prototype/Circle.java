package creational.prototype;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 28, 2024
 */
public class Circle implements Prototype {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.color);
    }

    @Override
    public String toString() {
        return color;
    }
}
