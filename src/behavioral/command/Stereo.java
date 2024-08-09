package behavioral.command;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 09, 2024
 */
public class Stereo implements Device {
    @Override
    public void turnOn() {
        System.out.println("Stereo is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is now off");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}
