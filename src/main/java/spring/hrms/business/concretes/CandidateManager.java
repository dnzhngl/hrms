package spring.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hrms.business.abstracts.CandidateService;
import spring.hrms.dataAccess.abstracts.CandidateDao;
import spring.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao CandidateDao;
    @Autowired
    public CandidateManager(CandidateDao CandidateDao) {
        this.CandidateDao = CandidateDao;
    }


    @Override
    public void add(Candidate candidate) {

    }

    @Override
    public Candidate getById(int id) {
        return null;
    }
}
