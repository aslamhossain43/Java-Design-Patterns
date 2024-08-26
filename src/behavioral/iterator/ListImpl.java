package behavioral.iterator;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 26, 2024
 */
public class ListImpl<E> implements List<E> {
    private E[] e;

    public ListImpl(E[] e) {
        this.e = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorImpl<>(e);
    }
}
