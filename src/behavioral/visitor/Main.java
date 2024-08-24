package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public class Main {
    public static void main(String[] args) {
        List<ItemElement> itemElements = new ArrayList<>();
        Apple apple = new Apple(100);
        itemElements.add(apple);
        Orange orange = new Orange(100);
        itemElements.add(orange);
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        for (ItemElement itemElement : itemElements) {
            double price = itemElement.accept(visitor);
            if (itemElement instanceof Apple) {
                System.out.println("Apple price: " + price);
            } else if (itemElement instanceof Orange) {
                System.out.println("Orange price: " + price);
            }
        }
    }
}
