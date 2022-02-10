package prototype;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		String movie = PrototypeFactory.get("Movie").toString();
		System.out.println(movie);
		String song = PrototypeFactory.get("Song").toString();
		System.out.println(song);
	}

}
