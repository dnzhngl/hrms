package spring.hrms.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="job_titles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Setter(AccessLevel.PROTECTED)
    private int id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;
}
