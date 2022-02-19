package visitor;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 19, 2022
 *
 */
public class DLinkRouter implements Router {

	@Override
	public void sendData(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptData(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVisitor(RouterVisitor routerVisitor) {
		routerVisitor.visit(this);

	}

}
