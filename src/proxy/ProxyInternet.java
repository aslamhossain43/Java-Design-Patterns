package proxy;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 13, 2022
 *
 */

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet {
	private Internet internet = new RealInternet();
	private static Set<String> bannedHosts = new HashSet<>();
	static {
		bannedHosts.add("google");
		bannedHosts.add("facebook");
		bannedHosts.add("amazon");
	}

	@Override
	public void connect(String host) throws Exception {
		if (bannedHosts.contains(host)) {
			throw new Exception("Access denied");
		}
		internet.connect(host);

	}

}
