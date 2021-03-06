package pl.mm.notesKeeper.dto;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteDto extends BaseInfoDto {

    private String title;

    private String note;

    private UserDto ownerOfNote;

}
