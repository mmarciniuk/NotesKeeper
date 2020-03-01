package pl.mm.notesKeeper.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mm.notesKeeper.BaseApplicationTest;
import pl.mm.notesKeeper.model.Note;
import pl.mm.notesKeeper.model.User;
import pl.mm.notesKeeper.testDataBuilder.ModelNoteTestDataBuilder;
import pl.mm.notesKeeper.testDataBuilder.ModelUsersTestDataBuilder;

public class NoteRepositoryTest extends BaseApplicationTest {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private UserRepository userRepository;

    private Note noteToBeDeleted;
    private User userToBeDeleted;

    @Test
    public void testAddNote() {
        //given
        Note note = ModelNoteTestDataBuilder.createStandardNote();
        User ownerOfNote = ModelUsersTestDataBuilder.standardUser();
        ownerOfNote = userRepository.save(ownerOfNote);
        userToBeDeleted = ownerOfNote;
        note.setOwnerOfNoteId(ownerOfNote);

        //when
        note = noteRepository.save(note);
        noteToBeDeleted = note;

        //then
        Note foundNote = noteRepository.findByUuid(note.getUuid()).orElse(null);

        Assertions.assertNotNull(foundNote);
    }

    @AfterEach
    public void deleteUser() {
        noteRepository.delete(noteToBeDeleted);
        userRepository.delete(userToBeDeleted);
    }

}