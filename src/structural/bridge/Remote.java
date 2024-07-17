package structural.bridge;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 16, 2024
 */
public class Remote {
    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnable()) {
            device.setDisable(true);
        } else {
            device.setEnable(true);
        }
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
}
