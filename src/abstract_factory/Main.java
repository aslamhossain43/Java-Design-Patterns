package abstract_factory;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory roundFactory = factoryProducer.getFactory(true);
		AbstractFactory normalFactory = factoryProducer.getFactory(false);
		Shape roundShape = roundFactory.getShape("ROUND RECTANGLE");
		Shape normalShape = normalFactory.getShape("RECTANGLE");
		roundShape.draw();
		normalShape.draw();
	}

}
