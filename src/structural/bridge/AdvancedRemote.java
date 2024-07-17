package structural.bridge;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 16, 2024
 */
public class AdvancedRemote extends Remote {
    private final Device device;

    public AdvancedRemote(Device device) {
        super(device);
        this.device = device;
    }

    public void mute() {
        System.out.println("Device is muted by advanced remote");
        device.setVolume(0);
    }
}
