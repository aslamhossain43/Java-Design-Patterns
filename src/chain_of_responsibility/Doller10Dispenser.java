package chain_of_responsibility;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 8, 2022
 *
 */
public class Doller10Dispenser implements DispenseChain {
	private DispenseChain dispenseChain;

	@Override
	public void setNextChain(DispenseChain dispenseChain) {
		this.dispenseChain = dispenseChain;

	}

	@Override
	public void dispense(Currency currency) {
		int amount = currency.getAmount();
		if (amount >= 10) {
			int quotient = amount / 10;
			int remainder = amount % 10;
			System.out.println("Dispensing " + quotient + " 10 note from " + amount);
			if (remainder != 0) {
				this.dispenseChain.dispense(new Currency(remainder));
			}
		} else {
			this.dispenseChain.dispense(currency);
		}

	}

}
