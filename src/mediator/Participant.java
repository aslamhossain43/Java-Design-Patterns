package mediator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public interface Participant {
	public abstract void sendMsg(String message);

	public abstract void setname(String name);

	public abstract String getName();
}
