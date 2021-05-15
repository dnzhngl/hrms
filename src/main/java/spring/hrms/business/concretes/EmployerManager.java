package spring.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hrms.business.abstracts.EmployerService;
import spring.hrms.dataAccess.abstracts.EmployerDao;
import spring.hrms.entities.concretes.Employee;
import spring.hrms.entities.concretes.Employer;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Override
    public void add(Employer employer) {
        employerDao.save(employer);
    }

    @Override
    public void update(Employer employer) {
        employerDao.save(employer);
    }

    @Override
    public void delete(Employer employer) {
        employerDao.delete(employer);
    }

    @Override
    public Employer getById(int id) {
        return employerDao.findById(id).orElse(null);
    }

    @Override
    public List<Employer> getAll() {
        return employerDao.findAll();
    }
}
