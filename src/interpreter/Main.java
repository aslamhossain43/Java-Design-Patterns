package interpreter;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class Main {

	public static void main(String[] args) {

		Expression expression = null;

		InerpreterContext inerpreterContext = new InerpreterContext();

		expression = new IntToBinaryExpression(28);
		System.out.println("28 in binary is " + expression.interpret(inerpreterContext));

		expression = new IntToHexExpression(28);
		System.out.println("28 in hexadecimal is " + expression.interpret(inerpreterContext));

	}

}
