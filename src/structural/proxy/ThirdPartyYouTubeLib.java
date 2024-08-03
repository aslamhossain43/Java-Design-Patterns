package structural.proxy;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 03, 2024
 */
public interface ThirdPartyYouTubeLib {
    String listVideos();

    void downloadVideo(long id);
}
