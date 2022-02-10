package strategy;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 9, 2022
 *
 */
public class Subtraction implements Strategy {

	@Override
	public void calculate(int number1, int number2) {
		System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
	}
}
