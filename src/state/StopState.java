package state;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 20, 2022
 *
 */
public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Game is in stop mode");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Stop state";
	}
}
