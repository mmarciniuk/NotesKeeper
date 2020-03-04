package pl.mm.notesKeeper.dto;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDto extends BaseInfoDto {

    private String roleName;

}
