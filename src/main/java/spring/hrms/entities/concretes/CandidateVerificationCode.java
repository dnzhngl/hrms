package spring.hrms.entities.concretes;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "candidate_verification_codes")
@Data
public class CandidateVerificationCode extends VerificationCode{

/*
    @Column(name = "candidate_id")
    private int candidateId;
*/
    @ManyToOne
    @JoinColumn(name = "candidate_id", foreignKey = @ForeignKey(name="candidate_id_fk") ,nullable = false)
    private Candidate candidate;
}
