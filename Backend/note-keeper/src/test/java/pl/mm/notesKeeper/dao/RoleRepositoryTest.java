package pl.mm.notesKeeper.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mm.notesKeeper.BaseApplicationTest;
import pl.mm.notesKeeper.model.Role;

import java.util.Collection;

public class RoleRepositoryTest extends BaseApplicationTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testGetRoles() {
        //given

        //when
        Collection<Role> all = (Collection<Role>) roleRepository.findAll();

        //then
        Assertions.assertTrue(all.size() > 0);
    }

}