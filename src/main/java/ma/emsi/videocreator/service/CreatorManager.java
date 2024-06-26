package ma.emsi.videocreator.service;

import ma.emsi.videocreator.dao.entities.Creator;

import java.util.List;

public interface CreatorManager {

    public Creator addCreator(Creator creator);
    public Creator updateCreator(Creator creator);
    public boolean deleteCreator(Creator creator);
    public List<Creator> getAllCreators();
}
