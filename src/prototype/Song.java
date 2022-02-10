package prototype;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 4, 2022
 *
 */
public class Song implements PrototypeCapable {
	@Override
	public Song clone() throws CloneNotSupportedException {
		System.out.println("Cloning song object...");
		return (Song) super.clone();
	}

	@Override
	public String toString() {
		return "Song";
	}
}
