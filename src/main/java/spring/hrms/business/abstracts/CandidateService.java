package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {

    void add(Candidate candidate);
    void update(Candidate candidate);
    void delete(Candidate candidate);
    Candidate getById(int id);
    List<Candidate> getAll();
}
