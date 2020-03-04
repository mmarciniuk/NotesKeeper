package pl.mm.notesKeeper.service;

import pl.mm.notesKeeper.dto.Response;

import javax.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface BasicService {

    Response findByUuid(UUID uuid);

}
