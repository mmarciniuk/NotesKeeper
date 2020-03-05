package pl.mm.notesKeeper.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pl.mm.notesKeeper.dao.BaseInfoRepository;
import pl.mm.notesKeeper.dto.Response;

import java.util.UUID;

@Transactional
public abstract class BaseInfoService<T, ID> implements BasicService {

    @Autowired
    protected ModelMapper modelMapper;

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
