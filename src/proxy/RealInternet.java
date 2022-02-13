package proxy;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 13, 2022
 *
 */
public class RealInternet implements Internet {

	@Override
	public void connect(String host) throws Exception {
		System.out.println("Connecting to " + host);

	}

}
