package behavioral.mediator;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}
