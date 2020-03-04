package pl.mm.notesKeeper.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mm.notesKeeper.BaseApplicationTest;
import pl.mm.notesKeeper.model.Note;
import pl.mm.notesKeeper.model.Role;
import pl.mm.notesKeeper.model.User;
import pl.mm.notesKeeper.testDataBuilder.ModelNoteTestDataBuilder;
import pl.mm.notesKeeper.testDataBuilder.ModelRoleTestDataBuilder;
import pl.mm.notesKeeper.testDataBuilder.ModelUsersTestDataBuilder;

import java.util.ArrayList;

public class NoteRepositoryTest extends BaseApplicationTest {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    private Note noteToBeDeleted;
    private User userToBeDeleted;

    @Test
    public void testAddNote() {
        //given
        Role userRole = ModelRoleTestDataBuilder.userRole();
        userRole = roleRepository.findByRoleName(userRole.getRoleName()).orElse(null);


        User ownerOfNote = ModelUsersTestDataBuilder.standardUser();
        ownerOfNote.setRoles(new ArrayList<>());
        ownerOfNote.getRoles().add(userRole);

        ownerOfNote = userRepository.save(ownerOfNote);
        userToBeDeleted = ownerOfNote;

        Note note = ModelNoteTestDataBuilder.createStandardNote();
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