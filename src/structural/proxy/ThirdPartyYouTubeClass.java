package structural.proxy;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 03, 2024
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    @Override
    public String listVideos() {
        return "10 videos available";
    }

    @Override
    public void downloadVideo(long id) {
        System.out.println(id + " no video is downloading");
    }
}
