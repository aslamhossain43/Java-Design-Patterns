package command;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 14, 2022
 *
 */
public class OnLightCommand implements ICommand {
	private Light light;

	public OnLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("Turning on light");
		light.on();
	}

}
