package adapter;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 5, 2022
 *
 */
public class MoveAbleAdapterImpl implements MoveAbleAdapter {
	private MoveAble moveAble;

	public MoveAbleAdapterImpl(MoveAble moveAble) {
		this.moveAble = moveAble;
	}

	@Override
	public double getSpeed() {
		return convertMphToKmph(moveAble.getSpeed());
	}

	public double convertMphToKmph(double mph) {
		// kmph
		return mph * 1.60934;
	}

}
