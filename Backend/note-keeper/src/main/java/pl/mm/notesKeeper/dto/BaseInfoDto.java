package pl.mm.notesKeeper.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BaseInfoDto {

    protected UUID uuid;

    protected Timestamp createdTimestamp;

    protected Timestamp modificationTimestamp;

}
