package interpreter;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class InerpreterContext {

	public String getBinary(int value) {
		return Integer.toBinaryString(value);
	}

	public String getHexaDecimal(int value) {
		return Integer.toHexString(value);
	}
}
