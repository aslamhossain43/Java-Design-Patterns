package strategy;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Context addition = new Context(new Addition());
		addition.execute(10, 5);
		Context subtraction = new Context(new Subtraction());
		subtraction.execute(10, 5);

	}

}
