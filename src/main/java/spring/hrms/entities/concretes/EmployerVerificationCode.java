package spring.hrms.entities.concretes;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employers_verification_codes")
@Data
public class EmployerVerificationCode extends VerificationCode{

/*
    @Id
    @Column(name = "verification_code_id")
    private int verificationCodeId;

    @Column(name = "employer_id")
    private int employerId;
*/

    @ManyToOne
    @JoinColumn(name = "employer_id", foreignKey = @ForeignKey(name="employer_id_fk"), nullable = false)
    private Employer employer;
}
