package behavioral.state;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
