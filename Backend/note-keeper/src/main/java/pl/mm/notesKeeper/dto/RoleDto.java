package pl.mm.notesKeeper.dto;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleDto extends BaseInfoDto {

    private String roleName;

}
