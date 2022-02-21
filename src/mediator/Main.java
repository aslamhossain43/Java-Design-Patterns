package mediator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class Main {

	public static void main(String[] args) {

		FamilyChat familyChat = new FamilyChat();
		
		Aslam aslam = new Aslam(familyChat);
		aslam.setname("Zoti");
		aslam.sendMsg("Hello, how are you ?");

		Zoti zoti = new Zoti(familyChat);
		zoti.setname("Aslam");
		zoti.sendMsg("I am fine, You ?");
	}

}
