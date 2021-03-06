package spring.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends User{

    @Column(name = "first_name", nullable = false, length = 35)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 35)
    private String lastName;

    @OneToMany(mappedBy = "employee")
    private Set<EmployerVerificationByEmployee> employerVerificationByEmployee;
}
