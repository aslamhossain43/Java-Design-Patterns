package behavioral.memento;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void write(String text) {
        this.content += text;
    }

    public String getContent() {
        return this.content;
    }

    public DocumentMemento createMemento() {
        return new DocumentMemento(this.content);
    }

    public void restoreFromMemento(DocumentMemento memento) {
        this.content = memento.getSavedContent();
    }
}
