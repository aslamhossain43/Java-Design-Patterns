package abstract_factory;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 3, 2022
 *
 */
public class FactoryProducer {
	private AbstractFactory abstractFactory;

	public AbstractFactory getFactory(boolean round) {
		if (round) {
			abstractFactory = new RoundShapFactory();
		} else if (!round) {
			abstractFactory = new NormalShapFactory();
		}
		return abstractFactory;
	}

}
