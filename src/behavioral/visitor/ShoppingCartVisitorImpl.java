package behavioral.visitor;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public double visit(Apple apple) {
        double appDiscount = 10d / 100;
        return apple.getPrice() - apple.getPrice() * appDiscount;
    }

    @Override
    public double visit(Orange orange) {
        double orangeDiscount = 20d / 100;
        return orange.getPrice() - orange.getPrice() * orangeDiscount;
    }
}
