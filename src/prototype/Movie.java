package prototype;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 4, 2022
 *
 */
public class Movie implements PrototypeCapable {

	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning movie object...");
		return (Movie) super.clone();
	}

	@Override
	public String toString() {
		return "Movie";
	}
}
