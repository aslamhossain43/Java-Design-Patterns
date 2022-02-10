package singleton;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		EarlyInstantiation.get().hello();
		LazyInstantiation.get().hello();

	}

}
