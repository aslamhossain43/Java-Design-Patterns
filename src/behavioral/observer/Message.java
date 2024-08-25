package behavioral.observer;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public class Message {
    final String messageContent;

    public Message(String m) {
        this.messageContent = m;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
