package behavioral.observer;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyUpdate(Message m);
}
