package template;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 15, 2022
 *
 */
public class Cricket extends Game {

	@Override
	void end() {
		System.out.println("Cricket ended");

	}

	@Override
	void start() {
		System.out.println("Cricket started");

	}

	@Override
	void initialize() {
		System.out.println("Cricket initialized");

	}

}
