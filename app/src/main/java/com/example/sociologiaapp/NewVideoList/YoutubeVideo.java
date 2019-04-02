package com.example.sociologiaapp.NewVideoList;

public class YoutubeVideo {

    String videoUrl;
    String textVideo;



    public String getTextVideo() {
        return textVideo;
    }

    public void setTextVideo(String textVideo) {
        this.textVideo = textVideo;
    }

    public YoutubeVideo(String videoUrl, String textVideo) {
        this.videoUrl = videoUrl;
        this.textVideo = textVideo;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
