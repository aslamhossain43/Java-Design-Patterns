package iterator;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class Names implements Container {

	public String names[] = { "Aslam", "Zoti", "Asha", "Shobuz" };

	@Override
	public Iterator iterator() {
		return new NameIterate();
	}

	private class NameIterate implements Iterator {
		int i;

		@Override
		public boolean hasNext() {
			if (i < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[i++];
			}
			return null;
		}

	}
}
