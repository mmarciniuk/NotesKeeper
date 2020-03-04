package pl.mm.notesKeeper.service;

import pl.mm.notesKeeper.dao.BaseInfoRepository;
import pl.mm.notesKeeper.dto.Response;

import javax.transaction.Transactional;
import java.util.UUID;

@Transactional
public abstract class BaseInfoService<T, ID> implements BasicService {

    protected final BaseInfoRepository<T, ID> repository;

    protected BaseInfoService(BaseInfoRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public Response findByUuid(UUID uuid) {
        //ToDo
        return null;
    }
}
