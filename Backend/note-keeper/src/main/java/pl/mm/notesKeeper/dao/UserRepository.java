package pl.mm.notesKeeper.dao;

import org.springframework.stereotype.Repository;
import pl.mm.notesKeeper.model.User;

@Repository
public interface UserRepository extends BaseInfoRepository<User, Long> {
}
