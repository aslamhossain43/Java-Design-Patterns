package template;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 15, 2022
 *
 */
public abstract class Game {

	abstract void initialize();

	abstract void start();

	abstract void end();

	// Template method
	public final void play() {
		initialize();
		start();
		end();
	}

}
