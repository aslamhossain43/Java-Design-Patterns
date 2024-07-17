package structural.adapter;

/**
 * @Author Md. Aslam Hossain
 * @Date Jul 15, 2024
 */
public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(8);
        System.out.println("Is fit round peg: " + roundHole.fits(roundPeg));
        SquarePeg squarePeg = new SquarePeg(7);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(9, squarePeg);
        System.out.println("Is fit square peg: " + roundHole.fits(squarePegAdapter));

    }
}
