package singleton;
/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 2, 2022
 *
 */
public class EarlyInstantiation {
	private static EarlyInstantiation earlyInstantiation = new EarlyInstantiation();

	private EarlyInstantiation() {

	}

	public static EarlyInstantiation get() {
		return earlyInstantiation;
	}

	public void hello() {
		System.out.println("Hello from " + EarlyInstantiation.class.getName());
	}
}
