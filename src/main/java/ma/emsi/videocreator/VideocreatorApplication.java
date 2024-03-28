package ma.emsi.videocreator;

import ma.emsi.videocreator.dao.entities.Creator;
import ma.emsi.videocreator.dao.entities.Video;
import ma.emsi.videocreator.dao.repositories.CreatorRepository;
import ma.emsi.videocreator.dao.repositories.VideoRepository;
import ma.emsi.videocreator.service.CreatorManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class VideocreatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideocreatorApplication.class, args);
    }


    @Bean
    public CommandLineRunner start(VideoRepository videoRepository, CreatorRepository creatorRepository) {
        return args -> {
            Video video = new Video();
            video.setName("Entertainment");
            video.setDescription("The most entertaining video");
            video.setUrl("www.youtube.com//entertainment");
            video.setDatePublication(new Date());
            videoRepository.save(video);

            Creator creator = new Creator();
            creator.setName("Chunkz");
            creator.setEmail("chunkzforcollab@gmail.com");
            creatorRepository.save(creator);

        };
    }

    @Bean
    public CommandLineRunner startService(CreatorManager creatorManager) {
        return args -> {

            Creator creator = new Creator();
            creator.setName("Taha");
            creator.setEmail("Taha@gmail.com");

            Creator creator1 = new Creator();
            creator1.setName("Yasmine");
            creator1.setEmail("Yasmine@gmail.com");
            creatorManager.addCreator(creator);
            creatorManager.addCreator(creator1);

            System.out.println(creatorManager.getAllCreators());

        };
    }
}