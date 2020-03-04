package pl.mm.notesKeeper.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NoteDto extends BaseInfoDto {

    private String title;

    private String note;

    private UserDto ownerOfNote;

}
