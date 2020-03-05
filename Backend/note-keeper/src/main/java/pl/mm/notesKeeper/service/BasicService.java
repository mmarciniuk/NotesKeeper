package pl.mm.notesKeeper.service;

import org.springframework.transaction.annotation.Transactional;
import pl.mm.notesKeeper.dto.Response;

import java.util.UUID;

@Transactional
public interface BasicService {

    Response findByUuid(UUID uuid);

}
