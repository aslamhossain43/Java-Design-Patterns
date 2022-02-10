package observer;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 7, 2022
 *
 */
public class Subscriber1 implements Observer {

	@Override
	public void update(Message message) {
		System.out.println("Subscriber 1 " + message.getMessage());
	}

}
