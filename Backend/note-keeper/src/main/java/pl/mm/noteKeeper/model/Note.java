package pl.mm.noteKeeper.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "note")
public class Note extends BaseInfo {

    @Column(name = "Title", nullable = false)
    private String title;

    @Lob
    @Column(name = "Note", nullable = false)
    private String note;

    @ManyToOne
    @JoinColumn(name = "ownerOfNoteId", nullable = false)
    private User ownerOfNoteId;

}
