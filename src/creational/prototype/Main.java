package creational.prototype;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 28, 2024
 */
public class Main {
    public static void main(String[] args) {
        Prototype circle1 = new Circle("Red");
        Prototype circle2 = circle1.clone();
        System.out.println(circle1 + " circle");
        System.out.println(circle2 + " circle");
    }
}
