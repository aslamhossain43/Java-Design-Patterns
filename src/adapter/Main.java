package adapter;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		BMW bmw = new BMW();
		System.out.println(bmw.getSpeed() + " mph");
		MoveAbleAdapter moveAbleAdapter = new MoveAbleAdapterImpl(bmw);
		System.out.println(moveAbleAdapter.getSpeed() + " kmph");

	}

}
