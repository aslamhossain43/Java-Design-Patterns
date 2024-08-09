package behavioral.chain_of_responsibility;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 09, 2024
 */
public class Request {
    private final Priority priority;

    public Request(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
