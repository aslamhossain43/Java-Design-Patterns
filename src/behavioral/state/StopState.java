package behavioral.state;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
