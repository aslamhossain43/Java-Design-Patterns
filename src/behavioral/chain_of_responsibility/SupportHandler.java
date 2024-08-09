package behavioral.chain_of_responsibility;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 09, 2024
 */
public interface SupportHandler {
    void handleRequest(Request request);

    void setNextHandler(SupportHandler nextHandler);
}
