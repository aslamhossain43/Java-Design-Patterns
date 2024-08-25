package behavioral.template;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
