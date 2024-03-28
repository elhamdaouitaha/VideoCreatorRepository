package ma.emsi.videocreator.service;

import ma.emsi.videocreator.dao.entities.Video;
import ma.emsi.videocreator.dao.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements VideoManager {

    @Autowired
    VideoRepository videoRepository;

    @Override
    public Video addVideo(Video video) {
        try {
            return videoRepository.save(video);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
    @Override
    public Video updateVideo(Video video) {
        return null;
    }

    @Override
    public boolean deleteVideo(Video video) {
        return false;
    }

    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @Override
    public boolean deleteVideoByID(Integer id) {
        return false;
    }
}