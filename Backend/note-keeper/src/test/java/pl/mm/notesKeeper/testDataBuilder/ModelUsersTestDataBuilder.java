package pl.mm.notesKeeper.testDataBuilder;

import pl.mm.notesKeeper.model.User;

import java.util.UUID;

public class ModelUsersTestDataBuilder {

    public static User standardUser() {
        User user = new User();

        user.setUuid(UUID.randomUUID());
        user.setUserName("kowalj");
        user.setPassword("somePassword");
        user.setFirstName("Jan");
        user.setLastName("Kowalski");
        user.setAddressEmail("kowalj@gmail.com");

        return user;
    }

}
