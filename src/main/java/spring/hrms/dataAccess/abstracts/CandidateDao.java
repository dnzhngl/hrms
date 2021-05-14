package spring.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
}
