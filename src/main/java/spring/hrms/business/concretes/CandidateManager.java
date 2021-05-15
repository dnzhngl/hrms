package spring.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hrms.business.abstracts.CandidateService;
import spring.hrms.dataAccess.abstracts.CandidateDao;
import spring.hrms.entities.concretes.Candidate;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public void add(Candidate candidate) {
        candidateDao.save(candidate);
    }

    @Override
    public void update(Candidate candidate) {
        candidateDao.save(candidate);
    }

    @Override
    public void delete(Candidate candidate) {
        candidateDao.delete(candidate);
    }

    @Override
    public Candidate getById(int id) {
        return null;
    }

    @Override
    public List<Candidate> getAll() {
        return candidateDao.findAll();
    }
}
