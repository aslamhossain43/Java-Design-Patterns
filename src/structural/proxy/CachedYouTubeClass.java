package structural.proxy;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 03, 2024
 */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    private final ThirdPartyYouTubeLib thirdPartyYouTubeLib;
    private final boolean needReset;
    private String listVideoCache;

    public CachedYouTubeClass(ThirdPartyYouTubeLib thirdPartyYouTubeLib, boolean needReset) {
        this.thirdPartyYouTubeLib = thirdPartyYouTubeLib;
        this.needReset = needReset;
    }

    @Override
    public String listVideos() {
        if (listVideoCache == null || needReset) {
            listVideoCache = thirdPartyYouTubeLib.listVideos();
        }
        return listVideoCache;
    }

    @Override
    public void downloadVideo(long id) {
        if (!isExistVideoInCache(id) || needReset) {
            thirdPartyYouTubeLib.downloadVideo(id);
        }
    }

    private boolean isExistVideoInCache(long id) {
        return false;
    }
}
