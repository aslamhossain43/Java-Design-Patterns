package prototype;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 4, 2022
 *
 */

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	private static Map<String, PrototypeCapable> prototypes = new HashMap<>();
	static {
		prototypes.put("Movie", new Movie());
		prototypes.put("Song", new Song());
	}

	public static PrototypeCapable get(final String objectName) throws CloneNotSupportedException {
		return prototypes.get(objectName).clone();
	}
}
