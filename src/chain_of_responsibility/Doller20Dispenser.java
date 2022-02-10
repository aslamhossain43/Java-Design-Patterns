package chain_of_responsibility;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 8, 2022
 *
 */
public class Doller20Dispenser implements DispenseChain {
	private DispenseChain dispenseChain;

	@Override
	public void setNextChain(DispenseChain dispenseChain) {
		this.dispenseChain = dispenseChain;

	}

	@Override
	public void dispense(Currency currency) {
		int amount = currency.getAmount();
		if (amount >= 20) {
			int quotient = amount / 20;
			int remainder = amount % 20;
			System.out.println("Dispensing " + quotient + " 20 note from " + amount);
			if (remainder != 0) {
				this.dispenseChain.dispense(new Currency(remainder));
			}
		} else {
			this.dispenseChain.dispense(currency);
		}

	}

}
