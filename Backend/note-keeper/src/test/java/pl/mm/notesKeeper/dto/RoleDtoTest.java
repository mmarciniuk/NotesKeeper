package pl.mm.notesKeeper.dto;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mm.notesKeeper.BaseApplicationTest;
import pl.mm.notesKeeper.model.Role;
import pl.mm.notesKeeper.testDataBuilder.ModelRoleTestDataBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class RoleDtoTest extends BaseApplicationTest {

    @Autowired
    private ModelMapper modelMapper;

    @Test
    public void whenConvertNoteModelToNoteDto_thenCorrect() {
        Role role = ModelRoleTestDataBuilder.adminRole();

        RoleDto roleDto = modelMapper.map(role, RoleDto.class);

        assertEquals(role.getRoleName(), roleDto.getRoleName());
    }


}