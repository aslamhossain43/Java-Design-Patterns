package behavioral.command;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 09, 2024
 */
public class ChangeChannelCommand implements Command {
    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
