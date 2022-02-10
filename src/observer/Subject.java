package observer;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 7, 2022
 *
 */
public interface Subject {
	public void attach(Observer observer);

	public void detach(Observer observer);

	public void notify(Message message);

}
