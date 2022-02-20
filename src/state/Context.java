package state;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 20, 2022
 *
 */
public class Context {
	private State state;

	public Context() {
		state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
