package pl.mm.notesKeeper.testDataBuilder;

import pl.mm.notesKeeper.model.Note;

import java.util.UUID;

public class ModelNoteTestDataBuilder {

    public static Note createStandardNote() {
        Note note = new Note();

        note.setUuid(UUID.randomUUID());
        note.setTitle("StandardNote");
        note.setNote("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");


        return note;
    }

}
