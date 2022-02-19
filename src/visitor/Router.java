package visitor;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 19, 2022
 *
 */
public interface Router {

	public void sendData(String data);

	public void acceptData(String data);

	public void setVisitor(RouterVisitor routerVisitor);

}
