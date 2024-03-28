package ma.emsi.videocreator.dao.repositories;

import ma.emsi.videocreator.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository
        extends JpaRepository<Video, Integer> {
}
