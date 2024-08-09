package behavioral.command;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 09, 2024
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
