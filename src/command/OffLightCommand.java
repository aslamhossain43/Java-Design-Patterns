package command;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 14, 2022
 *
 */
public class OffLightCommand implements ICommand {
	private Light light;

	public OffLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("Turning off light");
		light.off();
	}

}
