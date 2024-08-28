package creational.builder;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 28, 2024
 */
public class Main {
    public static void main(String[] args) {
        Post post = new Post.Builder()
                .title("Title")
                .text("Text")
                .category("Category")
                .build();
    }
}
