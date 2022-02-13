package proxy;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 13, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		try {
			internet.connect("tizaramart");
			internet.connect("google");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
