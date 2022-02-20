package interpreter;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class IntToHexExpression implements Expression {
	private int value;

	public IntToHexExpression(int value) {
		this.value = value;
	}

	@Override
	public String interpret(InerpreterContext inerpreterContext) {
		return inerpreterContext.getHexaDecimal(value);
	}

}
