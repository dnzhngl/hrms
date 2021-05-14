package spring.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employers_verification_by_employees")
@Data
public class EmployerVerificationByEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "is_verified", nullable = false, columnDefinition = "boolean default false")
    private boolean isVerified;

    @Column(name = "created_date", columnDefinition = "date default NOW()")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "employer_id", foreignKey = @ForeignKey(name="employer_id_fk") ,nullable = false)
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name="employee_id_fk") ,nullable = false)
    private Employee employee;
}

