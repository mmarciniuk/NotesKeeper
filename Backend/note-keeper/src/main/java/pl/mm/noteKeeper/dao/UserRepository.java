package pl.mm.noteKeeper.dao;

import org.springframework.stereotype.Repository;
import pl.mm.noteKeeper.model.User;

@Repository
public interface UserRepository extends BaseInfoRepository<User, Long> {
}
