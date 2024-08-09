package behavioral.command;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 09, 2024
 */
public class AdjustVolumeCommand implements Command {
    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}
