package visitor;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 19, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		// Setup
		LinuxConfigurator linuxConfigurator = new LinuxConfigurator();
		MacConfigurator macConfigurator = new MacConfigurator();
		WindowsConfigurator windowsConfigurator = new WindowsConfigurator();

		DLinkRouter dLinkRouter = new DLinkRouter();
		TPLinkRouter tpLinkRouter = new TPLinkRouter();
		// DLink
		dLinkRouter.setVisitor(linuxConfigurator);
		dLinkRouter.setVisitor(macConfigurator);
		dLinkRouter.setVisitor(windowsConfigurator);

		System.out.println();

		// TPLink
		tpLinkRouter.setVisitor(linuxConfigurator);
		tpLinkRouter.setVisitor(macConfigurator);
		tpLinkRouter.setVisitor(windowsConfigurator);

	}

}
