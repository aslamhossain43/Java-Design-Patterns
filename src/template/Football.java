package template;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 16, 2022
 *
 */
public class Football extends Game {

	@Override
	void end() {
		System.out.println("Football ended");

	}

	@Override
	void start() {
		System.out.println("Football started");

	}

	@Override
	void initialize() {
		System.out.println("Football initialized");

	}

}
