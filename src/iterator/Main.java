package iterator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class Main {

	public static void main(String[] args) {

		Names names = new Names();

		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println("Name: " + name);
		}

	}

}
