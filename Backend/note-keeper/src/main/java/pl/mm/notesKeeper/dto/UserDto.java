package pl.mm.notesKeeper.dto;

import lombok.*;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto extends BaseInfoDto {

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String addressEmail;

    private Collection<RoleDto> roles;

    private Collection<NoteDto> notes;

}
