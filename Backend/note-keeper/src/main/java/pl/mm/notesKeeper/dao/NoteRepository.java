package pl.mm.notesKeeper.dao;

import org.springframework.stereotype.Repository;
import pl.mm.notesKeeper.model.Note;

@Repository
public interface NoteRepository extends BaseInfoRepository<Note, Long> {
}
