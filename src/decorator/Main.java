package decorator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Food vegetableFood = new VegetableFood();
		System.out.println(vegetableFood.prepareFood());
		Food chineeseVegetableFood = new ChineeseVegetableFood(vegetableFood);
		System.out.println(chineeseVegetableFood.prepareFood());
	}

}
