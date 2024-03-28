package ma.emsi.videocreator.service;

import ma.emsi.videocreator.dao.entities.Video;

import java.util.List;

public interface VideoManager {
    public Video addVideo(Video video);
    public Video updateVideo(Video video);
    public boolean deleteVideo(Video video);
    public boolean deleteVideoByID(Integer id);
    public List<Video> getAllVideos();
}