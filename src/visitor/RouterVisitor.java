package visitor;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 19, 2022
 *
 */
public interface RouterVisitor {

	public void visit(DLinkRouter dLinkRouter);

	public void visit(TPLinkRouter tpLinkRouter);
}
