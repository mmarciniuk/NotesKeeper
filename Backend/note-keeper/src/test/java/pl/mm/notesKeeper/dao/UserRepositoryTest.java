package pl.mm.notesKeeper.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mm.notesKeeper.BaseApplicationTest;
import pl.mm.notesKeeper.model.Role;
import pl.mm.notesKeeper.model.User;
import pl.mm.notesKeeper.testDataBuilder.ModelRoleTestDataBuilder;
import pl.mm.notesKeeper.testDataBuilder.ModelUsersTestDataBuilder;

import java.util.ArrayList;

public class UserRepositoryTest extends BaseApplicationTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    private User userToDelete;

    @Test
    public void testSaveUser() {
        //given
        Role adminRole = ModelRoleTestDataBuilder.adminRole();
        adminRole = roleRepository.findByRoleName(adminRole.getRoleName()).orElse(null);
        User user = ModelUsersTestDataBuilder.standardUser();
        user.setRoles(new ArrayList<>());
        user.getRoles().add(adminRole);

        //when
        user = userRepository.save(user);
        userToDelete = user;

        //then
        User loadedUser = userRepository.findById(user.getId()).orElse(null);

        assertUser(loadedUser);
    }

    @Test
    public void testFindUserByUuid() {
        //given
        Role adminRole = ModelRoleTestDataBuilder.adminRole();
        adminRole = roleRepository.findByRoleName(adminRole.getRoleName()).orElse(null);
        User user = ModelUsersTestDataBuilder.standardUser();
        user.setRoles(new ArrayList<>());
        user.getRoles().add(adminRole);

        //when
        user = userRepository.save(user);
        userToDelete = user;

        //then
        User foundUser = userRepository.findByUuid(user.getUuid()).orElse(null);

        assertUser(foundUser);
    }

    private void assertUser(User user) {
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getId(), user.getId());
        Assertions.assertEquals(user.getUuid(), user.getUuid());
    }

    @AfterEach
    public void deleteUser() {
        userRepository.delete(userToDelete);
    }

}