package ma.emsi.videocreator.service;

import ma.emsi.videocreator.dao.entities.Creator;
import ma.emsi.videocreator.dao.repositories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatorService implements CreatorManager {
    @Autowired
    private CreatorRepository creatorRepository;

    @Override
    public Creator addCreator(Creator creator) {
        try {
            return creatorRepository.save(creator);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    @Override
    public Creator updateCreator(Creator creator) {
        return null;
    }

    @Override
    public boolean deleteCreator(Creator owner) {
        return false;
    }

    @Override
    public List<Creator> getAllCreators() {
        return creatorRepository.findAll();
    }
}
