package pl.mm.notesKeeper.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public abstract class BaseInfoRepositoryImpl<T, ID> implements BaseInfoRepository<T, ID> {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Optional<T> findByUuid(UUID uuid) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        //noinspection unchecked
        Class<T> clazz = (Class<T>) this.getClass();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(clazz);
        Root<T> root = query.from(clazz);

        Path<String> uuidPath = root.get("uuid");
        Predicate predicate = criteriaBuilder.like(uuidPath, uuid.toString());

        query.select(root)
                .where(criteriaBuilder.and(predicate));

        return Optional.ofNullable(entityManager.createQuery(query).getSingleResult());
    }
}
