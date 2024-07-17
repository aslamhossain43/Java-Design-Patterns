package structural.flyweight;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 17, 2024
 */
public class Tree {
    private final TreeName treeName;

    public Tree(TreeName treeName) {
        this.treeName = treeName;
    }

    public void draw() {
        System.out.println("Drawing Tree name: " + this.treeName);
    }
}
