package decorator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 6, 2022
 *
 */
public class ChineeseVegetableFood extends FoodDecorator {

	public ChineeseVegetableFood(Food food) {
		super(food);
	}

	public String prepareFood() {
		return super.prepareFood() + " with chineese";
	}

}
