package behavioral.strategy;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 24, 2024
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
