package spring.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hrms.business.abstracts.JobTitleService;
import spring.hrms.dataAccess.abstracts.JobTitleDao;
import spring.hrms.entities.concretes.JobTitle;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;
    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao){
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public List<JobTitle> getAll() {
        return jobTitleDao.findAll();
    }

    @Override
    public void add(JobTitle jobTitle) {
        jobTitleDao.save(jobTitle);
    }

    @Override
    public void update(JobTitle jobTitle) {
        jobTitleDao.save(jobTitle);
    }

    @Override
    public void delete(JobTitle jobTitle) {
        jobTitleDao.delete(jobTitle);
    }

    @Override
    public JobTitle getById(int id) {
        return jobTitleDao.findById(id).orElse(null);
    }

}
