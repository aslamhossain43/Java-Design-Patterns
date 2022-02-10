package singleton;
/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 2, 2022
 *
 */
public class LazyInstantiation {
	private static LazyInstantiation lazyInstantiation;

	private LazyInstantiation() {

	}

	public static LazyInstantiation get() {
		if (lazyInstantiation == null) {
			synchronized (LazyInstantiation.class) {
				if (lazyInstantiation == null) {
					lazyInstantiation = new LazyInstantiation();
				}
			}
		}
		return lazyInstantiation;
	}

	public void hello() {
		System.out.println("Hello from " + LazyInstantiation.class.getName());
	}
}
