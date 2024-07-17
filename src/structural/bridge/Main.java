package structural.bridge;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 16, 2024
 */
public class Main {
    public static void main(String[] args) {
//        Advanced feature here
        AdvancedDevice advancedDevice = new AdvancedDevice();
        AdvancedRemote advancedRemote = new AdvancedRemote(advancedDevice);
        advancedRemote.mute();
    }
}
