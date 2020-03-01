package pl.mm.notesKeeper.model;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "user")
public class User extends BaseInfo {

    @Length(min = 5, max = 50, message = "Username need contains at least 5 characters and at most 50 characters.")
    @NotBlank(message = "User name cannot be empty.")
    @Column(name = "UserName", unique = true, nullable = false, length = 50)
    private String userName;

    @Length(min = 5, max = 80, message = "Password need contains at least 5 characters and at most 80 characters.")
    @NotBlank(message = "Password cannot be empty.")
    @Column(name = "Password", nullable = false, length = 80)
    private String password;

    @Length(min = 1, max = 50, message = "First name need contains at least 1 character and at most 50 characters.")
    @NotBlank(message = "First name cannot be empty.")
    @Column(name = "FirstName", nullable = false, length = 50)
    private String firstName;

    @Length(min = 1, max = 50, message = "Last name need contains at least 1 character and at most 50 characters.")
    @NotBlank(message = "Last name cannot be empty.")
    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;

    @Length(max = 100, message = "Email address need contains at most 100 characters.")
    @Pattern(regexp = "(^[A-z0-9]+)(@)([A-z]+)(\\.)([A-z]+$)", message = "Email address has incorrect format.")
    @NotBlank(message = "Email address cannot be empty.")
    @Column(name = "AddressEmail", nullable = false, length = 100)
    private String addressEmail;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "UserId"),
            inverseJoinColumns = @JoinColumn(name = "RoleId"))
    private Collection<Role> roles;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "ownerOfNoteId", cascade = CascadeType.REMOVE)
    private Collection<Note> notes;

}
