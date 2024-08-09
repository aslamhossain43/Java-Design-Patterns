package behavioral.command;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 09, 2024
 */
public class TurnOnCommand implements Command {
    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
