package structural.proxy;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 03, 2024
 */
public class YouTubeManager {
    private final ThirdPartyYouTubeLib thirdPartyYouTubeLib;

    public YouTubeManager(ThirdPartyYouTubeLib thirdPartyYouTubeLib) {
        this.thirdPartyYouTubeLib = thirdPartyYouTubeLib;
    }

    public void showVideos() {
        String listVideos = thirdPartyYouTubeLib.listVideos();
        System.out.println(listVideos);
    }

    public void downloadVideo(long id) {
        thirdPartyYouTubeLib.downloadVideo(id);
    }
}
