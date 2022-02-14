package command;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 14, 2022
 *
 */
public class StopFanCommand implements ICommand {
	private Fan fan;

	public StopFanCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		System.out.println("Stopping fan");
		fan.stop();
	}

}
