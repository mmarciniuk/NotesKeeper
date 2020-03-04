package pl.mm.notesKeeper.testDataBuilder;

import pl.mm.notesKeeper.model.Role;

import java.util.UUID;

public class ModelRoleTestDataBuilder {

    public static Role adminRole() {
        Role role = new Role();

        role.setUuid(UUID.randomUUID());
        role.setRoleName("ADMIN");

        return role;
    }

}
