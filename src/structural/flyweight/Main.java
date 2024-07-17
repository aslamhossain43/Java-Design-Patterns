package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 16, 2024
 */
public class Main {

    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>();
        trees.add(TreeFactory.getTree(TreeName.APPLE));
        trees.add(TreeFactory.getTree(TreeName.BANANA));
        trees.add(TreeFactory.getTree(TreeName.ORANGE));
        trees.add(TreeFactory.getTree(TreeName.DATE));
        trees.add(TreeFactory.getTree(TreeName.MANGO));
        trees.add(TreeFactory.getTree(TreeName.MANGO));
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
