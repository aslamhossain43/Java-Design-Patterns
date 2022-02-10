package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 7, 2022
 *
 */
public class MessagePublisher implements Subject {
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notify(Message message) {
		for (Observer o : observers) {
			o.update(message);
		}

	}

}
