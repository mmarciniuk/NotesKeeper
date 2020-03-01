package pl.mm.notesKeeper.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import pl.mm.notesKeeper.converter.UUIDConverter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "base_info")
public abstract class BaseInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false, updatable = false)
    private long id;

    @Convert(converter = UUIDConverter.class)
    @Column(name = "Uuid", unique = true, nullable = false, updatable = false, length = 36)
    private UUID uuid;

    @CreationTimestamp
    @Column(name = "CreatedTimestamp", nullable = false, updatable = false)
    private Timestamp createdTimestamp;

    @UpdateTimestamp
    @Column(name = "ModificationTimestamp")
    private Timestamp modificationTimestamp;

}
