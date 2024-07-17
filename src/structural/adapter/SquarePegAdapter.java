package structural.adapter;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 16, 2024
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(int roundPegRadius, SquarePeg squarePeg) {
        super(roundPegRadius);
        this.squarePeg = squarePeg;
    }

    public int getRadius() {
        return (int) (this.squarePeg.getWidth() * Math.sqrt(2) / 2);
    }
}
