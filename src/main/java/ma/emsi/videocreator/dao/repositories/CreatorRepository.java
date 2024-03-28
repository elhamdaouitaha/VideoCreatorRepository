package ma.emsi.videocreator.dao.repositories;

import ma.emsi.videocreator.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository
        extends JpaRepository<Creator, Integer> {
}
