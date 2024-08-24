package behavioral.visitor;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public interface ItemElement {
    double accept(ShoppingCartVisitor visitor);
}
