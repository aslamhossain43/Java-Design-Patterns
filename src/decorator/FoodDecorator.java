package decorator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 6, 2022
 *
 */
public abstract class FoodDecorator implements Food {
	private Food food;

	public FoodDecorator(Food food) {
		this.food = food;
	}

	@Override
	public String prepareFood() {
		return food.prepareFood();

	}
}
