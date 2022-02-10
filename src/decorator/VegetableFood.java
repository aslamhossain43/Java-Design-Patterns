package decorator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 6, 2022
 *
 */
public class VegetableFood implements Food {

	@Override
	public String prepareFood() {
		return "Vegitable food";
	}

}
