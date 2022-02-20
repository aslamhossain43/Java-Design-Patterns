package interpreter;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class IntToBinaryExpression implements Expression {
	private int value;

	public IntToBinaryExpression(int value) {
		this.value = value;
	}

	@Override
	public String interpret(InerpreterContext inerpreterContext) {
		return inerpreterContext.getBinary(value);
	}

}
