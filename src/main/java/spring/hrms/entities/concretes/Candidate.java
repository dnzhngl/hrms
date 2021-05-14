package spring.hrms.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="candidates")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate extends User{

    // @Id
    // @Column(name="user_id")
    // private int userId;
    @Column(name="identity_no", nullable = false, length = 11, unique = true)
    private String IdentityNo;

    @Column(name="first_name", nullable = false, length = 35)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 35)
    private String lastName;

    @Column(name="date_of_birth", nullable = false)
    private Date dateOfBirth;

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateVerificationCode> verificationCodes;
}
