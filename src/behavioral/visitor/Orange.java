package behavioral.visitor;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public class Orange implements ItemElement {
    private double price;

    public Orange(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
