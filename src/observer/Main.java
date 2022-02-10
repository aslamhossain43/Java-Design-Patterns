package observer;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		MessagePublisher messagePublisher = new MessagePublisher();
		Subscriber1 subscriber1 = new Subscriber1();
		Subscriber2 subscriber2 = new Subscriber2();
		messagePublisher.attach(subscriber1);
		messagePublisher.attach(subscriber2);
		messagePublisher.notify(new Message(" is attached"));
	}

}
