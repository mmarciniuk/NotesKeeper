package pl.mm.notesKeeper.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface BaseInfoRepository<T, ID> extends CrudRepository<T, ID> {

    Optional<T> findByUuid(UUID uuid);

}
