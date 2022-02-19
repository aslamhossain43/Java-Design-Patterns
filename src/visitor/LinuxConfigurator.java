package visitor;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 19, 2022
 *
 */
public class LinuxConfigurator implements RouterVisitor {

	@Override
	public void visit(DLinkRouter dLinkRouter) {
		System.out.println("DLink Router configuration for linux is completed !");
	}

	@Override
	public void visit(TPLinkRouter tpLinkRouter) {
		System.out.println("TPLink Router configuration for linux is completed !");
	}

}
