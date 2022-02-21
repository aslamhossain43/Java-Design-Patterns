package mediator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class Zoti implements Participant {

	private String name;
	private Chat chat;

	public Zoti(Chat chat) {
		this.chat = chat;
	}

	@Override
	public void sendMsg(String message) {
		chat.showMessage(message, this);

	}

	@Override
	public void setname(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return name;
	}

}
