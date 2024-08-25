package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public class History {
    private List<DocumentMemento> mementos;

    public History() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(DocumentMemento memento) {
        this.mementos.add(memento);
    }

    public DocumentMemento getMemento(int index) {
        return this.mementos.get(index);
    }
}
