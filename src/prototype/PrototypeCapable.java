package prototype;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 4, 2022
 *
 */
public interface PrototypeCapable extends Cloneable {
	public PrototypeCapable clone() throws CloneNotSupportedException;
}
