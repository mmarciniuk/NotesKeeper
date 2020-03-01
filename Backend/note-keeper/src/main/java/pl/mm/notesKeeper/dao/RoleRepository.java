package pl.mm.notesKeeper.dao;

import org.springframework.stereotype.Repository;
import pl.mm.notesKeeper.model.Role;

@Repository
public interface RoleRepository extends BaseInfoRepository<Role, Long> {
}
