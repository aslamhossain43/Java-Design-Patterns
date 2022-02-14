package command;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 14, 2022
 *
 */
public class StartFanCommand implements ICommand {
	private Fan fan;

	public StartFanCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		System.out.println("Starting fan");
		fan.start();
	}

}
