package state;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 20, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());

		System.out.println();

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
