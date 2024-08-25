package behavioral.memento;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();

        // Write some content
        document.write("Additional content\n");
        history.addMemento(document.createMemento());

        // Write more content
        document.write("More content\n");
        history.addMemento(document.createMemento());

        // Restore to previous state
        document.restoreFromMemento(history.getMemento(1));

        // Print document content
        System.out.println(document.getContent());
    }
}
