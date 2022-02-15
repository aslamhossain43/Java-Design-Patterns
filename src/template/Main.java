package template;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 16, 2022
 *
 */
public class Main {
	public static void main(String[] args) {
		Game cricket = new Cricket();
		cricket.play();
		System.out.println();
		Game football = new Football();
		football.play();
	}
}
