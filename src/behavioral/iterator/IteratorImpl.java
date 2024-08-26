package behavioral.iterator;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 26, 2024
 */
public class IteratorImpl<E> implements Iterator<E> {
    private E[] e;
    private int position;

    public IteratorImpl(E[] e) {
        this.e = e;
        position = 0;
    }

    @Override
    public E next() {
        return e[position++];
    }

    @Override
    public boolean hasNext() {
        return position < e.length;
    }
}
