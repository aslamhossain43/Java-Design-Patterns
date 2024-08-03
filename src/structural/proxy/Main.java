package structural.proxy;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 03, 2024
 */
public class Main {
    public static void main(String[] args) {
        ThirdPartyYouTubeLib thirdPartyYouTubeClass = new ThirdPartyYouTubeClass();
        CachedYouTubeClass cachedYouTubeClass = new CachedYouTubeClass(thirdPartyYouTubeClass, false);
        YouTubeManager youTubeManager = new YouTubeManager(cachedYouTubeClass);
        youTubeManager.showVideos();
        youTubeManager.downloadVideo(1);
    }
}
