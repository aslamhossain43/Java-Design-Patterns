package strategy;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 9, 2022
 *
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void execute(int number1, int number2) {
		this.strategy.calculate(number1, number2);
	}
}
