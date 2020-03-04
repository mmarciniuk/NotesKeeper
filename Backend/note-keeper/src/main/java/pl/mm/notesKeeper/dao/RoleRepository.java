package pl.mm.notesKeeper.dao;

import org.springframework.stereotype.Repository;
import pl.mm.notesKeeper.model.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends BaseInfoRepository<Role, Long> {

    Optional<Role> findByRoleName(String roleName);

}
