package pl.mm.noteKeeper.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import pl.mm.noteKeeper.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
