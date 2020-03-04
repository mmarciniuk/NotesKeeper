package pl.mm.notesKeeper.service;

import org.springframework.stereotype.Service;
import pl.mm.notesKeeper.dao.BaseInfoRepository;
import pl.mm.notesKeeper.model.Role;

@Service
public class RoleService extends BaseInfoService<Role, Long> {

    protected RoleService(BaseInfoRepository<Role, Long> repository) {
        super(repository);
    }

}
