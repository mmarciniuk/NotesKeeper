package pl.mm.notesKeeper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseInfoDto {

    protected UUID uuid;

    protected Timestamp createdTimestamp;

    protected Timestamp modificationTimestamp;

}
