package structural.adapter;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 16, 2024
 */
public class RoundHole {
    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }


}
