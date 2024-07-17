package structural.bridge;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 16, 2024
 */
public class Device {
    private boolean enable;
    private boolean disable;
    private int volume;
    private int channel;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
