package spring.hrms.entities.concretes;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User{

    @Column(name = "company_name", nullable = false, unique = true, length = 60)
    private String companyName;

    @Column(name = "website", nullable = false, unique = true, length = 63)
    private String website;

    @Column(name="phone_number", nullable = false, length = 15)
    private String phoneNumber;

    @OneToMany(mappedBy = "employer")
    private Set<EmployerVerificationCode> verificationCodes;

    @OneToMany(mappedBy = "employer")
    private Set<EmployerVerificationByEmployee> employerVerificationByEmployee;

}
