package behavioral.memento;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public class DocumentMemento {
    private String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getSavedContent() {
        return this.content;
    }
}
