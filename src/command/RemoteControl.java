package command;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 14, 2022
 *
 */
public class RemoteControl {
	private ICommand iCommand;

	public void setiCommand(ICommand iCommand) {
		this.iCommand = iCommand;
	}

	public void buttonPress() {
		iCommand.execute();
	}

}
