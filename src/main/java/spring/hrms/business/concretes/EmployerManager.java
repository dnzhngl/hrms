package spring.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hrms.business.abstracts.EmployerService;
import spring.hrms.dataAccess.abstracts.EmployerDao;
import spring.hrms.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Override
    public void add(Employer employer) {
    }

    @Override
    public Employer getById(int id) {
        return null;
    }
}
