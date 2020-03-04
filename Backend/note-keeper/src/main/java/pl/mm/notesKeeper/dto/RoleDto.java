package pl.mm.notesKeeper.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleDto extends BaseInfoDto {

    private String roleName;

}
