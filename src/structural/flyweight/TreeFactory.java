package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 17, 2024
 */
public class TreeFactory {
    private static final Map<TreeName, Tree> TREE_MAP = new HashMap<>();

    public static Tree getTree(TreeName treeName) {
        Tree tree = TREE_MAP.get(treeName);
        if (tree == null) {
            tree = new Tree(treeName);
            TREE_MAP.put(treeName, tree);
        }
        return tree;
    }
}
