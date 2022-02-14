package command;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 14, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		Light light = new Light();
		Fan fan = new Fan();

		remote.setiCommand(new OnLightCommand(light));
		remote.buttonPress();

		remote.setiCommand(new OffLightCommand(light));
		remote.buttonPress();

		remote.setiCommand(new StartFanCommand(fan));
		remote.buttonPress();

		remote.setiCommand(new StopFanCommand(fan));
		remote.buttonPress();

	}

}
