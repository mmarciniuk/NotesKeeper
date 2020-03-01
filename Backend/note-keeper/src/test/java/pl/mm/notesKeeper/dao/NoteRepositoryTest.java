package pl.mm.notesKeeper.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mm.notesKeeper.BaseApplicationTest;
import pl.mm.notesKeeper.model.Note;
import pl.mm.notesKeeper.testDataBuilder.ModelNoteTestDataBuilder;

public class NoteRepositoryTest extends BaseApplicationTest {

    @Autowired
    private NoteRepository noteRepository;

    private Note noteToBeDeleted;

    @Test
    public void testAddNote() {
        //given
        Note note = ModelNoteTestDataBuilder.createStandardNote();

        //when
        note = noteRepository.save(note);
        noteToBeDeleted = note;

        //then
        
    }

    @AfterEach
    public void deleteUser() {
        noteRepository.delete(noteToBeDeleted);
    }

}