package state;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 20, 2022
 *
 */
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Game is in start mode");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Start state";
	}

}
