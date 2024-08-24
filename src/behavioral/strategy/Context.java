package behavioral.strategy;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
