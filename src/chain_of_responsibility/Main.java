package chain_of_responsibility;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Doller20Dispenser doller20Dispenser = new Doller20Dispenser();
		Doller10Dispenser doller10Dispenser = new Doller10Dispenser();
		doller20Dispenser.setNextChain(doller10Dispenser);
		doller20Dispenser.dispense(new Currency(50));

	}

}
