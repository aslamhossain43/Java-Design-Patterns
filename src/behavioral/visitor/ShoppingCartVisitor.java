package behavioral.visitor;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public interface ShoppingCartVisitor {
    double visit(Apple apple);

    double visit(Orange orange);
}
