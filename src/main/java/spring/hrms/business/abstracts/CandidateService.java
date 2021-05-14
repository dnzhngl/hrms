package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.Candidate;

public interface CandidateService {

    void add(Candidate candidate);
    Candidate getById(int id);
}
