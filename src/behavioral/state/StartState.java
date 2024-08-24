package behavioral.state;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
