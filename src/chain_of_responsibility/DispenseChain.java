package chain_of_responsibility;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 8, 2022
 *
 */
public interface DispenseChain {
	public void setNextChain(DispenseChain dispenseChain);

	public void dispense(Currency currency);
}
